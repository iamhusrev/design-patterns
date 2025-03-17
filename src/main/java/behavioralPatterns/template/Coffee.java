package behavioralPatterns.template;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Kahveyi demliyorum...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Şeker ve süt ekliyorum...");
    }
}
