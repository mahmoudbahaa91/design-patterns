package com.designpatterns.structural.decorator;

public class LuxuryCar extends CarDecorator {

    LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }

}
