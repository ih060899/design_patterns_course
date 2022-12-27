package creational_design_pattern.abstractFactory.ant;

import creational_design_pattern.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
