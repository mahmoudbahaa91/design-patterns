package com.designpatterns.structural.abstractfactory.factories;

import com.designpatterns.structural.abstractfactory.products.Button;
import com.designpatterns.structural.abstractfactory.products.LinuxButton;
import com.designpatterns.structural.abstractfactory.products.LinuxTextField;
import com.designpatterns.structural.abstractfactory.products.TextField;

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
