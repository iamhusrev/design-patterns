package behavioralPatterns.visitor2;

public interface Operation {
    void apply(AnchorNode anchor);

    void apply(HeadingNode heading);
}
