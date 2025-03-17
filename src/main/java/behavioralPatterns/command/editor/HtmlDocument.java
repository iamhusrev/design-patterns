package behavioralPatterns.command.editor;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HtmlDocument {
    private String content;

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }

}
