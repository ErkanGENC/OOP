package ders24;

import ders22.Swimmable;

public class Fish extends Animal implements Swimmable {

    @Override
    public void swim() {
        System.out.println("Fish is swimming...");
    }

    @Override
    public void move() {
        System.out.println("fish is moving...");
    }
}
