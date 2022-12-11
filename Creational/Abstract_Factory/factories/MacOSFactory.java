package Creational.Abstract_Factory.factories;

import Creational.Abstract_Factory.buttons.Button;
import Creational.Abstract_Factory.buttons.MacOSButton;
import Creational.Abstract_Factory.checkboxes.Checkbox;
import Creational.Abstract_Factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
