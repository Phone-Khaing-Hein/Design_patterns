package Creational.Factory_Method.factory;

import Creational.Factory_Method.buttons.Button;
import Creational.Factory_Method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
