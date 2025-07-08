package _1_behavioral_pattern._11_visitor2_pattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private final List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void execute(Operation operation) {
        for (var node : nodes)
            node.execute(operation);
    }
}
