package Project;

import java.util.ArrayList;

public class Sum_tree extends Segment_trees {
    public Sum_tree(ArrayList<Integer> a) {
        super(a);
    }

    @Override
    public int defaultDelta() {
        return 0;}

    @Override
    public int operation(int a, int b) {
        return a+b;
    }

    @Override
    public int defaultValue() {
        return 0;
    }

    @Override
    public void change(int v, int delta) {
        func.set(v,func.get(v)+delta);
        this.delta.set(v,this.delta.get(v)+delta);
    }
}