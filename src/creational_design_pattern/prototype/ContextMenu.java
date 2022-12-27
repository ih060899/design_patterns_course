package creational_design_pattern.prototype;

public class ContextMenu {
    public void duplicate(Component component){
       Component newComponent = component.clone();
    }
}
