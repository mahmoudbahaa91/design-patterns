package com.designpatterns.structural.decorator;

public class SportCar extends CarDecorator {

    SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }

}
