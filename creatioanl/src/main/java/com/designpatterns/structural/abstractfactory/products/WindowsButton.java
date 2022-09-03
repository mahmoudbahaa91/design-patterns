package com.designpatterns.structural.abstractfactory.products;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Creating Windows Button...");
    }

}
