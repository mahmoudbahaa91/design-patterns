package com.designpatterns.creational.builder.example2;

public class PizzaBuilder {

    private final Pizza pizza;

    public PizzaBuilder(String pizzaName) {
        pizza = new Pizza(pizzaName);
    }

    public PizzaBuilder withCheese() {
        pizza.setCheese(true);
        return this;
    }

    public PizzaBuilder withTomato() {
        pizza.setTomato(true);
        return this;
    }

    public PizzaBuilder withMushroom() {
        pizza.setMushroom(true);
        return this;
    }

    public PizzaBuilder withPineApple() {
        pizza.setPineApple(false);
        return this;
    }

    public Pizza build() {
        return pizza;
    }

}
