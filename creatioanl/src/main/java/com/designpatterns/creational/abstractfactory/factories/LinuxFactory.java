package com.designpatterns.creational.abstractfactory.factories;

import com.designpatterns.creational.abstractfactory.products.Button;
import com.designpatterns.creational.abstractfactory.products.LinuxButton;
import com.designpatterns.creational.abstractfactory.products.LinuxTextField;
import com.designpatterns.creational.abstractfactory.products.TextField;

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
