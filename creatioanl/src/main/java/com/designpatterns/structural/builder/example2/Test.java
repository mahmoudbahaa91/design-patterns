package com.designpatterns.structural.builder.example2;

public class Test {

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder("Classic Pizza").withCheese().withMushroom().withTomato();
        Pizza pizza = pizzaBuilder.build();
        System.out.println(pizza);
    }

}
