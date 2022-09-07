package com.designpatterns.creational.abstractfactory.products;

public class LinuxButton implements Button {

    @Override
    public void paint() {
        System.out.println("Creating Linux Button...");
    }

}
