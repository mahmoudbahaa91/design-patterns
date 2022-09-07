package com.designpatterns.creational.prototype;

public class Position {

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected int x;

    protected int y;

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
