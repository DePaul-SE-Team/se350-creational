package org.example.FactoryMethod.UI;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
