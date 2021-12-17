package Project.segment_tree;

import java.util.List;

public class GetSumUpdateSetTree extends SegmentTree<Double> {

    public GetSumUpdateSetTree(List<Double> arrayValues) {
        super(arrayValues);
    }

    @Override
    protected Double defaultValue() {
        return 0.0;
    }

    @Override
    protected Double getVertex(int vertex) {
        return isLazyVertex(vertex)
                ? segmentLengths.get(vertex) * lazyValues.get(vertex)
                : treeValues.get(vertex);
    }

    @Override
    protected void mergeVertex(int leftTargetVertex, int rightSourceVertex) {
        setVertex(
                leftTargetVertex,
                treeValues.get(leftTargetVertex) + getVertex(rightSourceVertex)
        );
    }

    @Override
    protected Double defaultLazyValue() {
        return Double.NaN;
    }

    @Override
    protected boolean isLazyVertex(int vertex) {
        return !Double.isNaN(lazyValues.get(vertex));
    }

    @Override
    protected void updateLazyValue(int vertex, Double delta) {
        setLazyValue(vertex, delta);
    }
}