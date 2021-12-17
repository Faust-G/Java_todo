package Project;

public interface SegmentProcessor<T> {

    void update(int start, int end, T delta);
    T get(int start, int end);
}
