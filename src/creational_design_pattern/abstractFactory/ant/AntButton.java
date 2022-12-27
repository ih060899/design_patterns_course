package creational_design_pattern.abstractFactory.ant;

import creational_design_pattern.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
