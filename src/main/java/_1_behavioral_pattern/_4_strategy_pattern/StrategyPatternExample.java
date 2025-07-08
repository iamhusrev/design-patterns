package _1_behavioral_pattern._4_strategy_pattern;


public class StrategyPatternExample {

    public static void main(String[] args) {

        var imageStorage = new ImageStorage();

        imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());


    }
}
