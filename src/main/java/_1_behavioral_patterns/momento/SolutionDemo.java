package _1_behavioral_patterns.momento;

public class SolutionDemo {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setContent("Version 1");
        history.addMemento(editor.save());

        editor.setContent("Version 2");
        history.addMemento(editor.save());

        editor.setContent("Version 3");

        System.out.println("Content: " + editor.getContent());

        editor.restore(history.getMemento(0));
        System.out.println("Undo Content To: " + editor.getContent());
    }
}
