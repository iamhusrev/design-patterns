package _1_behavioral_pattern._8_mediator_pattern;

public class UIControl {

    protected final DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }


}
