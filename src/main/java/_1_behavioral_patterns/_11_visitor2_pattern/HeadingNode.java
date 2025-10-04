package _1_behavioral_patterns._11_visitor2_pattern;

public class HeadingNode implements HtmlNode {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
