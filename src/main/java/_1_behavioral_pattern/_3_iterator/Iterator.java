package _1_behavioral_pattern._3_iterator;

public interface Iterator<T> {
    boolean hasNext();

    void next();

    T currentItem();
}
