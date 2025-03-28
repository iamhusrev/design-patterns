package behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class DataSource implements Subject {
    private int value;

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer added");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed");
    }

    @Override
    public void notifyObservers(int value) {
        System.out.println("Notify observers");
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }
}
