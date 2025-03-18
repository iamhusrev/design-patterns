package behavioralPatterns.mediator;


import lombok.Getter;
import lombok.Setter;

@Getter
public class ListBox extends UIControl {

    private String selection;


    public ListBox(DialogBox owner) {
        super(owner);
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.changed(this );
    }
}
