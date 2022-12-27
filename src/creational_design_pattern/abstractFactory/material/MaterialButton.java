package creational_design_pattern.abstractFactory.material;

import creational_design_pattern.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
