package com.designpatterns.structural.abstractfactory;

import com.designpatterns.structural.abstractfactory.factories.WindowsFactory;
import com.designpatterns.structural.abstractfactory.products.Button;
import com.designpatterns.structural.abstractfactory.factories.GUIFactory;
import com.designpatterns.structural.abstractfactory.factories.LinuxFactory;
import com.designpatterns.structural.abstractfactory.products.TextField;

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
