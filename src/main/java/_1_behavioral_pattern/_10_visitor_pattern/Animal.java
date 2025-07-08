package _1_behavioral_pattern._10_visitor_pattern;


public interface Animal {
    void accept(AnimalVisitor visitor);
}
