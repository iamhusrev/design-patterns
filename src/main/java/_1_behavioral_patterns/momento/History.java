package _1_behavioral_patterns.momento;

import java.util.ArrayList;
import java.util.List;

class History {
    private final List<EditorState> history = new ArrayList<>();

    public void addMemento(EditorState editorState) {
        history.add(editorState);
    }

    public EditorState getMemento(int index) {
        return history.get(index);
    }
}