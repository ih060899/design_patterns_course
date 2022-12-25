package structural_design_patterns.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        storeCreditCard(new CompressedCloudStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-1234");
    }
}
