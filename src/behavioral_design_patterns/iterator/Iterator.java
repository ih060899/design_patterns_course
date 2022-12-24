package behavioral_design_patterns.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
