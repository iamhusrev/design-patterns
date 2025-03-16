package _1_behavioral_patterns.momento;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextEditor {
    private String content;

    public EditorState save() {
        return new EditorState(content);
    }

    public void restore(EditorState editorState) {
        this.content = editorState.getState();
    }
}