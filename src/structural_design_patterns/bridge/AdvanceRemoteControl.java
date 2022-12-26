package structural_design_patterns.bridge;

public class AdvanceRemoteControl extends RemoteControl{
    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int num){
        device.setChannel(num);
    }
}
