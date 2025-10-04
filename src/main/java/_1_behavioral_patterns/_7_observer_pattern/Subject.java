package _1_behavioral_patterns._7_observer_pattern;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(int value);
}
