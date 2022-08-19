package creational.abstractfactory.factories;

import creational.abstractfactory.products.Button;
import creational.abstractfactory.products.TextField;
import creational.abstractfactory.products.WindowsButton;
import creational.abstractfactory.products.WindowsTextField;

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
