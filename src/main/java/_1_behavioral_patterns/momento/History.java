package _1_behavioral_patterns.momento;

import java.util.ArrayList;
import java.util.List;

class History {
    private final List<Memento> history = new ArrayList<>();

    public void addMemento(Memento memento) {
        history.add(memento);
    }

    public Memento getMemento(int index) {
        return history.get(index);
    }
}