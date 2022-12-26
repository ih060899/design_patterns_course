package structural_design_patterns.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(new SamsungTv());
        remote.turnOn();
        remote.turnOff();
    }
}
