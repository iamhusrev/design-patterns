package _2_structural_patterns._4_facade_pattern;

// Subsystem 3
class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading " + size + " bytes from HDD sector " + lba);
        return new byte[size]; // Dummy data
    }
}