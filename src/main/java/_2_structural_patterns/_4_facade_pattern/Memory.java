package _2_structural_patterns._4_facade_pattern;

// Subsystem 2
class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data to memory position " + position);
    }
}