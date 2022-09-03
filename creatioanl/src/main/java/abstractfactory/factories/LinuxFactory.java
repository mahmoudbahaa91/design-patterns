package abstractfactory.factories;

import abstractfactory.products.Button;
import abstractfactory.products.LinuxButton;
import abstractfactory.products.LinuxTextField;
import abstractfactory.products.TextField;

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
