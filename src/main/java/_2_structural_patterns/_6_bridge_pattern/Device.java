package _2_structural_patterns._6_bridge_pattern;

// Implementor interface
interface Device {
    void turnOn();

    void turnOff();

    void setVolume(int percent);
}

