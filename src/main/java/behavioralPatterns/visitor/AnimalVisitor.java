package behavioralPatterns.visitor;

public interface AnimalVisitor {
    void visit(Dog dog);

    void visit(Cat cat);

    void visit(Horse horse);
}
