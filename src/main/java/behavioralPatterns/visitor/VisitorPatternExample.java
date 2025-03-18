package behavioralPatterns.visitor;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal horse = new Horse();

        AnimalVisitor soundVisitor = new AnimalSoundVisitor();

        // Visiting each animal
        dog.accept(soundVisitor);
        cat.accept(soundVisitor);
        horse.accept(soundVisitor);
    }
}