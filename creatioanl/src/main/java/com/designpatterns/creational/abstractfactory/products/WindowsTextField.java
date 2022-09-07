package com.designpatterns.creational.abstractfactory.products;

public class WindowsTextField implements TextField {

    @Override
    public void paint() {
        System.out.println("Creating Windows TextField...");
    }

}
