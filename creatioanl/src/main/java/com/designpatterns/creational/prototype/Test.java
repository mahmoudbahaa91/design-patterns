package com.designpatterns.creational.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        GameCharacter gameCharacter = new GameCharacter("AngryBird", 100,"Red", 5,1);
        GameCharacter gameCharacterClone = gameCharacter.clone();

        System.out.println(gameCharacter);
        System.out.println(gameCharacter);

        gameCharacterClone.moveRight();

        System.out.println(gameCharacterClone);
        System.out.println(gameCharacter);
    }

}
