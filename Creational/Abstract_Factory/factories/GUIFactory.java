package Creational.Abstract_Factory.factories;

import Creational.Abstract_Factory.buttons.Button;
import Creational.Abstract_Factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}