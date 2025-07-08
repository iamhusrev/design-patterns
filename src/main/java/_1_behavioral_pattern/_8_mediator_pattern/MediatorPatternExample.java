package _1_behavioral_pattern._8_mediator_pattern;

public class MediatorPatternExample {

    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
