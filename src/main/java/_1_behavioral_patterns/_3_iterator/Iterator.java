package _1_behavioral_patterns._3_iterator;

public interface Iterator<T> {
    boolean hasNext();

    void next();

    T currentItem();
}
