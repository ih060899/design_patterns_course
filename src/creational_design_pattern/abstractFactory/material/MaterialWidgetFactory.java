package creational_design_pattern.abstractFactory.material;

import creational_design_pattern.abstractFactory.Button;
import creational_design_pattern.abstractFactory.TextBox;
import creational_design_pattern.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
