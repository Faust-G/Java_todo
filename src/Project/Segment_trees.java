package Project;

import java.util.ArrayList;

public abstract class Segment_trees {

    public abstract int defaultDelta();
    public abstract int operation(int a, int b);
    public abstract int defaultValue();
    public abstract void change(int v, int delta);
    protected ArrayList<Integer> func;
    protected ArrayList<Integer> delta;
    protected int size;

    public Segment_trees(ArrayList<Integer> a) {
        size = a.size();
        func=new ArrayList<>(4 * size + 2);
        delta = new ArrayList<>(4 * size + 2);
        for(int i=0;i<4 * size + 2;++i){
            func.add(0);
            delta.add(0);
        }
        build(0, size - 1, 1, a);
    }
    private void build(int left, int right, int v, ArrayList<Integer> a) {
        delta.set(v,defaultDelta());
        if (left == right) {
            func.set(v,a.get(left));
        } else {
            int middle = (left + right) >> 1;
            build(left, middle, v << 1, a);
            build(middle + 1, right, (v << 1) + 1, a);
            func.set(v,operation(func.get(v << 1), func.get((v << 1) + 1)));
        }
    }
    public void change(int left, int right, int delta) {
        change(0, size - 1, left, right, 1, delta);
    }
    private void change(int lTree, int rTree, int left, int right, int v, int delta) {
        if (rTree < left || right < lTree)
            return;
        push(v);
        if (left <= lTree && rTree <= right) {
            change(v, delta);
        } else {
            int middle = (lTree + rTree) >> 1;
            change(lTree, middle, left, right, v << 1, delta);
            change(middle + 1, rTree, left, right, (v << 1) + 1, delta);
            func.set(v, operation(func.get(v << 1), func.get((v << 1) + 1)));
        }
    }
    public int get(int left, int right) {
        return get(0, size - 1, left, right, 1);
    }

    private int get(int lTree, int rTree, int left, int right, int v) {
        if (rTree < left || right < lTree)
            return defaultValue();
        push(v);
        if (left <= lTree && rTree <= right)
            return func.get(v);
        else {
            int middle = (lTree + rTree) >> 1;
            return operation(
                    get(lTree, middle, left, right, v << 1),
                    get(middle + 1, rTree, left, right, (v << 1) + 1)
            );
        }
    }
    private void push(int v) {
        if (delta.get(v) != defaultDelta()) {
            if ((v << 1) < func.size())
                change(v << 1, delta.get(v));
            if ((v << 1) + 1 < func.size())
                change((v << 1) + 1, delta.get(v));
            delta.set(v,defaultDelta());
        }
    }
}
