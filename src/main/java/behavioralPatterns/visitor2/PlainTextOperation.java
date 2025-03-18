package behavioralPatterns.visitor2;

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
