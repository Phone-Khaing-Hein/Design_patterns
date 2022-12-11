package Creational.Abstract_Factory.factories;

import Creational.Abstract_Factory.buttons.Button;
import Creational.Abstract_Factory.buttons.WindowsButton;
import Creational.Abstract_Factory.checkboxes.Checkbox;
import Creational.Abstract_Factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
