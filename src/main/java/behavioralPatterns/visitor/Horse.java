package behavioralPatterns.visitor;

public class Horse implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
