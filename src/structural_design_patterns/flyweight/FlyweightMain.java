package structural_design_patterns.flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        PointService service = new PointService(new PointIconFactory());
        service.getPoints().forEach(Point::draw);
    }
}
