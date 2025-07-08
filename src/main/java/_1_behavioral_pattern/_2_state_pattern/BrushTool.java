package _1_behavioral_pattern._2_state_pattern;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
