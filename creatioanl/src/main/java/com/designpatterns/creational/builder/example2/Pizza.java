package com.designpatterns.creational.builder.example2;

public class Pizza {

    private boolean cheese;

    private boolean tomato;

    private boolean pineApple;

    private boolean mushroom;

    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isPineApple() {
        return pineApple;
    }

    public void setPineApple(boolean pineApple) {
        this.pineApple = pineApple;
    }

    public boolean isMushroom() {
        return mushroom;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese=" + cheese +
                ", tomato=" + tomato +
                ", pineApple=" + pineApple +
                ", mushroom=" + mushroom +
                ", name='" + name + '\'' +
                '}';
    }

}
