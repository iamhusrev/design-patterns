package _1_behavioral_patterns._11_visitor2_pattern;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("plain-text-anchor");
    }

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("plain-text-heading");
    }
}
