package behavioral_design_patterns.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a");
    }
}
