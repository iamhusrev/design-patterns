package behavioralPatterns.strategy;


public class SolutionDemo {

    public static void main(String[] args) {

        var imageStorage = new ImageStorage();

        imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());


    }
}
