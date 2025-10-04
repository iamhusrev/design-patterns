package _2_structural_patterns._1_composite_pattern;

// Leaf
class Circle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Circle çiziliyor.");
    }
}
