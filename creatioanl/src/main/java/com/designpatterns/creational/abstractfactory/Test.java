package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.factories.WindowsFactory;
import com.designpatterns.creational.abstractfactory.products.Button;
import com.designpatterns.creational.abstractfactory.factories.GUIFactory;
import com.designpatterns.creational.abstractfactory.factories.LinuxFactory;
import com.designpatterns.creational.abstractfactory.products.TextField;

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
