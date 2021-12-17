package Project.segment_tree;

import java.util.List;

public class GetMinUpdateAddTree extends SegmentTree<Integer> {

    public GetMinUpdateAddTree(List<Integer> arrayValues) {
        super(arrayValues);
    }

    @Override
    protected Integer defaultValue() {
        return Integer.MAX_VALUE;
    }

    @Override
    protected Integer getVertex(int vertex) {
        return treeValues.get(vertex) + lazyValues.get(vertex);
    }

    @Override
    protected void mergeVertex(int leftTargetVertex, int rightSourceVertex) {
        setVertex(
                leftTargetVertex,
                Math.min(treeValues.get(leftTargetVertex), getVertex(rightSourceVertex))
        );
    }

    @Override
    protected Integer defaultLazyValue() {
        return 0;
    }

    @Override
    protected void updateLazyValue(int vertex, Integer delta) {
        setLazyValue(vertex, lazyValues.get(vertex) + delta);
    }
}
