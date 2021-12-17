package Project.segment_tree;

import java.util.List;

public class GetMaxUpdateSetTree extends SegmentTree<Long> {
    public GetMaxUpdateSetTree(List<Long> arrayValues) {
        super(arrayValues);
    }

    @Override
    protected Long defaultValue() {
        return Long.MIN_VALUE;
    }

    @Override
    protected Long getVertex(int vertex) {
        return isLazyVertex(vertex) ? lazyValues.get(vertex) : treeValues.get(vertex);
    }

    @Override
    protected void mergeVertex(int leftTargetVertex, int rightSourceVertex) {
        setVertex(
                leftTargetVertex,
                Math.max(treeValues.get(leftTargetVertex), getVertex(rightSourceVertex))
        );
    }

    @Override
    protected Long defaultLazyValue() {
        return -1L;
    }

    @Override
    protected void updateLazyValue(int vertex, Long delta) {
        setLazyValue(vertex, delta);
    }
}
