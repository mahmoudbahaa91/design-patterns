package com.designpatterns.creational.abstractfactory.factories;

import com.designpatterns.creational.abstractfactory.products.Button;
import com.designpatterns.creational.abstractfactory.products.TextField;

public interface GUIFactory {

    Button createButton();

    TextField createTextField();

}
