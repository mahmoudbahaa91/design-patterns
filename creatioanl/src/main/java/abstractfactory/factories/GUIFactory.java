package abstractfactory.factories;

import abstractfactory.products.Button;
import abstractfactory.products.TextField;

public interface GUIFactory {

    Button createButton();

    TextField createTextField();

}
