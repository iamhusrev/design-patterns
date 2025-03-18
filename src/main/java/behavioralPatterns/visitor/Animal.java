package behavioralPatterns.visitor;


public interface Animal {
    void accept(AnimalVisitor visitor);
}
