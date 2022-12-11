package Factory_Method.factory;

import Factory_Method.buttons.Button;
import Factory_Method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
