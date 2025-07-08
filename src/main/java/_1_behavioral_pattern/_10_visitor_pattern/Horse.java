package _1_behavioral_pattern._10_visitor_pattern;

public class Horse implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
