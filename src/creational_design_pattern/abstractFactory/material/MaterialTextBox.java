package creational_design_pattern.abstractFactory.material;

import creational_design_pattern.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
