package behavioralPatterns.mediator;

public class MediatorPatternExample {

    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
