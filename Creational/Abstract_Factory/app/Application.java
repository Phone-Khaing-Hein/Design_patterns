package Creational.Abstract_Factory.app;

import Creational.Abstract_Factory.buttons.Button;
import Creational.Abstract_Factory.checkboxes.Checkbox;
import Creational.Abstract_Factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
