package _1_behavioral_pattern._4_strategy_pattern;

public class BlackAndWhiteFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying black and white filter");
    }
}
