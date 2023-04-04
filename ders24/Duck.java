package ders24;

import ders22.Swimmable;

public class Duck extends Animal implements Swimmable,Flyable {

    @Override
    public void move() {
        System.out.println("Duck is moving..");
    }

    @Override
    public void fly() {
        System.out.println("Duck is Flying..");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming..");
    }

}
