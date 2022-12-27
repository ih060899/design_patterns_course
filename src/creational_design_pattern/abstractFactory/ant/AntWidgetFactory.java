package creational_design_pattern.abstractFactory.ant;

import creational_design_pattern.abstractFactory.Button;
import creational_design_pattern.abstractFactory.TextBox;
import creational_design_pattern.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
