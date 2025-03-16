package behavioralPatterns.momento;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EditorState {
    private final String state;
}