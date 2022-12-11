package Creational.Factory_Method.factory;

import Creational.Factory_Method.buttons.Button;
import Creational.Factory_Method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}