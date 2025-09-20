package _3_creational_patterns._5_builder_pattern.car_example;

public class SUVBuilder extends CarBuilder {
    public SUVBuilder() {
        this.color = "Black";
        this.engine = "V6 Diesel";
        this.seats = 7;
    }
}
