package structural_design_patterns.facade;

public class FacadeMain {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send("Hello world", "target");
    }
}
