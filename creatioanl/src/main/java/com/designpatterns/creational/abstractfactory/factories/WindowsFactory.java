package com.designpatterns.creational.abstractfactory.factories;

import com.designpatterns.creational.abstractfactory.products.Button;
import com.designpatterns.creational.abstractfactory.products.TextField;
import com.designpatterns.creational.abstractfactory.products.WindowsButton;
import com.designpatterns.creational.abstractfactory.products.WindowsTextField;

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
