package Project.segment_tree;

import Project.SegmentProcessor;

import java.util.ArrayList;
import java.util.List;

abstract class SegmentTree<T> implements SegmentProcessor<T> {

    private static final int RESULT_VERTEX = 0, ROOT_VERTEX = 1;

    protected final int size;
    protected final List<T> treeValues;
    protected final List<Integer> segmentLengths;
    protected final List<T> lazyValues;

    public SegmentTree(List<T> arrayValues) {
        this.size = arrayValues.size();

        int treeSize = 4 * size + 2;

        this.treeValues = new ArrayList<>(treeSize);
        this.segmentLengths = new ArrayList<>(treeSize);
        this.lazyValues = new ArrayList<>(treeSize);

        for (int v = 0; v < treeSize; ++v) {
            treeValues.add(defaultValue());
            segmentLengths.add(0);
            lazyValues.add(defaultLazyValue());
        }

        buildTree(0, size, ROOT_VERTEX, arrayValues);
    }

    protected abstract T defaultLazyValue();

    protected abstract T defaultValue();

    protected void setVertex(int vertex, T value) {
        treeValues.set(vertex, value);
    }

    private void clearVertex(int vertex) {
        setVertex(vertex, defaultValue());
    }

    protected abstract T getVertex(int vertex);

    protected abstract void mergeVertex(int leftTargetVertex, int rightSourceVertex);

    private void updateVertex(int vertex, int leftVertex, int rightVertex) {
        clearVertex(vertex);
        mergeVertex(vertex, leftVertex);
        mergeVertex(vertex, rightVertex);
    }

    protected void setLazyValue(int vertex, T value) {
        lazyValues.set(vertex, value);
    }

    protected abstract void updateLazyValue(int vertex, T delta);

    protected boolean isLazyVertex(int vertex) {
        return !defaultLazyValue().equals(lazyValues.get(vertex));
    }

    private void pushVertex(int vertex, int leftVertex, int rightVertex) {
        T lazyValue = lazyValues.get(vertex);

        if (isLazyVertex(vertex)) {
            updateLazyValue(leftVertex, lazyValue);
            updateLazyValue(rightVertex, lazyValue);
            setLazyValue(vertex, defaultLazyValue());
        }
    }

    private void buildTree(int left, int right, int vertex, List<T> arrayValues) {
        segmentLengths.set(vertex, right - left);

        if (left + 1 == right) {
            setVertex(vertex, arrayValues.get(left));
        } else {
            int middle = (left + right) >> 1;
            int leftVertex = (vertex << 1), rightVertex = (leftVertex + 1);

            buildTree(left, middle, leftVertex, arrayValues);
            buildTree(middle, right, rightVertex, arrayValues);

            updateVertex(vertex, leftVertex, rightVertex);
        }
    }

    @Override
    public void update(int start, int end, T delta) {
        updateTree(0, size, ROOT_VERTEX, start, end, delta);
    }

    private void updateTree(int left, int right, int vertex, int start, int end, T delta) {
        if (start <= left && right <= end) {
            updateLazyValue(vertex, delta);
        } else {
            int middle = (left + right) >> 1;
            int leftVertex = (vertex << 1), rightVertex = (leftVertex + 1);

            pushVertex(vertex, leftVertex, rightVertex);

            if (start < middle) updateTree(left, middle, leftVertex, start, end, delta);
            if (middle < end) updateTree(middle, right, rightVertex, start, end, delta);

            updateVertex(vertex, leftVertex, rightVertex);
        }
    }

    @Override
    public T get(int start, int end) {
        clearVertex(RESULT_VERTEX);
        getTree(0, size, ROOT_VERTEX, start, end);
        return getVertex(RESULT_VERTEX);
    }

    private void getTree(int left, int right, int vertex, int start, int end) {
        if (start <= left && right <= end) {
            mergeVertex(RESULT_VERTEX, vertex);
        } else {
            int middle = (left + right) >> 1;
            int leftVertex = (vertex << 1), rightVertex = (leftVertex + 1);

            pushVertex(vertex, leftVertex, rightVertex);

            if (start < middle) getTree(left, middle, leftVertex, start, end);
            if (middle < end) getTree(middle, right, rightVertex, start, end);

            updateVertex(vertex, leftVertex, rightVertex);
        }
    }
}
