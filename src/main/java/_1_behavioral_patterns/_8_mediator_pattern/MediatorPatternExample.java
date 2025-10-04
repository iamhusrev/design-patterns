package _1_behavioral_patterns._8_mediator_pattern;

public class MediatorPatternExample {

    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
