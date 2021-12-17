package Project.cartesian_tree;

import Project.NavigableMultiSet;

import java.util.Random;

public class CartesianTree<T extends Comparable<T>> implements NavigableMultiSet<T> {

    private static final Random rnd = new Random();

    private final Pair<Vertex, Vertex> EMPTY_SPLIT = new Pair<>(null, null);

    private class Vertex {
        private final T key;
        private final int priority;

        private Vertex left, right;

        public Vertex(T key) {
            this.key = key;
            this.priority = rnd.nextInt();

            this.left = null;
            this.right = null;
        }
    }

    Vertex root;

    public CartesianTree() {
        this.root = null;
    }

    @Override
    public void add(T value) {
        // left <= value < right
        var splitResult = split(root, value);
        root = merge(
                splitResult.getLeft(),
                merge(new Vertex(value),
                        splitResult.getRight()
                )
        );
    }

    @Override
    public boolean contains(T value) {
        // left <= value < right
        var rightSplitResult = split(root, value);

        var leftMiddle = rightSplitResult.getLeft();

        // left < value <= right
        var leftSplitResult = split(
                leftMiddle, value, false
        );

        var equals = leftSplitResult.getRight();

        boolean contains = (null != equals);

        root = merge(
                leftSplitResult.getLeft(),
                merge(equals, rightSplitResult.getRight())
        );

        return contains;
    }

    @Override
    public void remove(T value) {
        // left <= value < right
        var rightSplitResult = split(root, value);

        var leftMiddle = rightSplitResult.getLeft();

        // left < value <= right
        var leftSplitResult = split(
                leftMiddle, value, false
        );

        var equals = leftSplitResult.getRight();

        if (null != equals) {
            // remove root of equals subtree
            equals = merge(equals.left, equals.right);
        }

        root = merge(
                leftSplitResult.getLeft(),
                merge(equals, rightSplitResult.getRight())
        );
    }

    @Override
    public T lower(T value) {
        // left < value <= right
        var leftSplitResult = split(root, value, false);

        var leftLower = leftSplitResult.getLeft();
        while (leftLower != null && leftLower.right != null) {
            leftLower = leftLower.right;
        }

        root = merge(
                leftSplitResult.getLeft(),
                leftSplitResult.getRight()
        );

        return null == leftLower ? null : leftLower.key;
    }

    @Override
    public T higher(T value) {
        // left <= value < right
        var rightSplitResult = split(root, value);

        var rightHigher = rightSplitResult.getRight();
        while (rightHigher != null && rightHigher.left != null) {
            rightHigher = rightHigher.left;
        }

        root = merge(
                rightSplitResult.getLeft(),
                rightSplitResult.getRight()
        );

        return null == rightHigher ? null : rightHigher.key;
    }

    private Vertex merge(Vertex left, Vertex right) {
        if (null == left) {
            return right;
        }

        if (null == right) {
            return left;
        }

        if (left.priority > right.priority) {
            left.right = merge(left.right, right);
            return left;
        } else {
            right.left = merge(left, right.left);
            return right;
        }
    }

    private Pair<Vertex, Vertex> split(Vertex vertex, T key) {
        return split(vertex, key, true);
    }

    /**
     * @return (left, right): any(left.key) <= key < any(right.key)
     */
    private Pair<Vertex, Vertex> split(Vertex vertex, T key, boolean equalsToLeft) {
        if (null == vertex) {
            return EMPTY_SPLIT;
        }

        int compareResult = vertex.key.compareTo(key);
        if (compareResult < 0 || (compareResult == 0 && equalsToLeft)) {
            /*
            v.key <= key
            v in left
            */

            var result = split(vertex.right, key, equalsToLeft);
            vertex.right = result.getLeft();
            return new Pair<>(vertex, result.getRight());
        } else {
            /*
            key < v.key
            v in right
             */

            var result = split(vertex.left, key, equalsToLeft);
            vertex.left = result.getRight();
            return new Pair<>(result.getLeft(), vertex);
        }
    }
}
