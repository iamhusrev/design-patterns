package _1_behavioral_patterns._2_state_pattern;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw dashed rectangle");
    }
}
