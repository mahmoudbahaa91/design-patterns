package creational.abstractfactory;

import creational.abstractfactory.factories.GUIFactory;
import creational.abstractfactory.factories.LinuxFactory;
import creational.abstractfactory.factories.WindowsFactory;
import creational.abstractfactory.products.Button;
import creational.abstractfactory.products.TextField;

public class Test {

    private final Button button;
    private final TextField textField;

    public Test(GUIFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
    }

    public void paint() {
        button.paint();
        textField.paint();
    }

    public static void main(String[] args) {

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("windows")) {
           new Test(new WindowsFactory()).paint();
        } else {
            new Test(new LinuxFactory()).paint();
        }

    }

}
