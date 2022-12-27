package creational_design_pattern.abstractFactory;

import creational_design_pattern.abstractFactory.ant.AntWidgetFactory;
import creational_design_pattern.abstractFactory.app.ContactForm;
import creational_design_pattern.abstractFactory.material.MaterialWidgetFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        new ContactForm().render(new AntWidgetFactory());
    }
}
