package _1_behavioral_patterns.momento;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextEditor {
    private String content;

    public Memento save() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        this.content = memento.getState();
    }
}