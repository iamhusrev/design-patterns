package _2_structural_patterns._4_facade_pattern;

// Subsystem 1
class CPU {
    public void freeze() {
        System.out.println("Freezing CPU...");
    }

    public void jump(long position) {
        System.out.println("Jumping to position " + position);
    }

    public void execute() {
        System.out.println("Executing instructions...");
    }
}