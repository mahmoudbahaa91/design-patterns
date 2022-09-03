package com.designpatterns.structural.abstractfactory.products;

public class WindowsTextField implements TextField {

    @Override
    public void paint() {
        System.out.println("Creating Windows TextField...");
    }

}
