package Factory_Method.factory;

import Factory_Method.buttons.Button;
import Factory_Method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}