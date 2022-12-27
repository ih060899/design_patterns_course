package creational_design_pattern.abstractFactory.app;

import creational_design_pattern.abstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
