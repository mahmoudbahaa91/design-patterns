package com.designpatterns.structural.abstractfactory.factories;

import com.designpatterns.structural.abstractfactory.products.Button;
import com.designpatterns.structural.abstractfactory.products.TextField;

public interface GUIFactory {

    Button createButton();

    TextField createTextField();

}
