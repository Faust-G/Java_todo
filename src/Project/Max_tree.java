package Project;

import java.util.ArrayList;

public class Max_tree extends Segment_trees {
    public Max_tree(ArrayList<Integer> a) {
        super(a);
    }

    @Override
    public int defaultDelta() {
        return 0;}

    @Override
    public int operation(int a, int b) {
        return Math.max(a, b);
    }

    @Override
    public int defaultValue() {
        return -Integer.MAX_VALUE;
    }

    @Override
    public void change(int v, int delta) {
        func.set(v,func.get(v)+delta);
        this.delta.set(v,this.delta.get(v)+delta);
    }
}
