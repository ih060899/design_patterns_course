package behavioral_design_patterns.chainOfResponsibility;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);
        WebServer server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
