package creational.abstractfactory.factories;

import creational.abstractfactory.products.Button;
import creational.abstractfactory.products.LinuxButton;
import creational.abstractfactory.products.LinuxTextField;
import creational.abstractfactory.products.TextField;

public class LinuxFactory implements  GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }

}
