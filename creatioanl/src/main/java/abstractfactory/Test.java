package abstractfactory;

import abstractfactory.factories.WindowsFactory;
import abstractfactory.products.Button;
import abstractfactory.factories.GUIFactory;
import abstractfactory.factories.LinuxFactory;
import abstractfactory.products.TextField;

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
