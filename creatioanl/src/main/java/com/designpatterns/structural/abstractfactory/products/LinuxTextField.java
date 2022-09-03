package com.designpatterns.structural.abstractfactory.products;

public class LinuxTextField implements TextField {

    @Override
    public void paint() {
        System.out.println("Creating Linux TextField...");
    }

}
