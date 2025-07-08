package _1_behavioral_pattern._11_visitor2_pattern;

public class HighlightOperation implements Operation {
    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlight-anchor");
    }

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlight-heading");
    }
}
