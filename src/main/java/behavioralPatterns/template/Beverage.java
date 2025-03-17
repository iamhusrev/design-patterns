package behavioralPatterns.template;

abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Suyu kaynatıyorum...");
    }

    private void pourInCup() {
        System.out.println("Bardak içine döküyorum...");
    }

    protected abstract void brew();

    protected abstract void addCondiments();
}