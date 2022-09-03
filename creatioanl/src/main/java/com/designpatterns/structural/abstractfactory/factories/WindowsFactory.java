package com.designpatterns.structural.abstractfactory.factories;

import com.designpatterns.structural.abstractfactory.products.Button;
import com.designpatterns.structural.abstractfactory.products.TextField;
import com.designpatterns.structural.abstractfactory.products.WindowsButton;
import com.designpatterns.structural.abstractfactory.products.WindowsTextField;

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
