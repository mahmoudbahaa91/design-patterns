package com.designpatterns.structural.decorator;

public class Test {

    public static void main(String[] args) {
        Car sportsCar = new SportCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("-----------");

        Car sportsLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
