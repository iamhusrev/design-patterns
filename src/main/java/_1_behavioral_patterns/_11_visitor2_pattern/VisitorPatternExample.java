package _1_behavioral_patterns._11_visitor2_pattern;

public class VisitorPatternExample {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}