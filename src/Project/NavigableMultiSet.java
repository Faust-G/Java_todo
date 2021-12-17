package Project;

public interface NavigableMultiSet<T extends Comparable<T>> {

    void add(T value);
    boolean contains(T value);
    void remove(T value);

    T lower(T value);
    T higher(T value);
}
