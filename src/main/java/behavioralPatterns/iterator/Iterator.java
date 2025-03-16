package behavioralPatterns.iterator;

public interface Iterator<T> {
    boolean hasNext();

    void next();

    T currentItem();
}
