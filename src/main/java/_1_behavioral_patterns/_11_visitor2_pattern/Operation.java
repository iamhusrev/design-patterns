package _1_behavioral_patterns._11_visitor2_pattern;

public interface Operation {
    void apply(AnchorNode anchor);

    void apply(HeadingNode heading);
}
