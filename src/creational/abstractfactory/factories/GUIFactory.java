package creational.abstractfactory.factories;

import creational.abstractfactory.products.Button;
import creational.abstractfactory.products.TextField;

public interface GUIFactory {

    Button createButton();

    TextField createTextField();

}
