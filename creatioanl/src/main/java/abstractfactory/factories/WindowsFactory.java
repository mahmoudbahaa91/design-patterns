package abstractfactory.factories;

import abstractfactory.products.Button;
import abstractfactory.products.TextField;
import abstractfactory.products.WindowsButton;
import abstractfactory.products.WindowsTextField;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }

}
