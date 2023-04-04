package ders22;

public class Duck extends Animal implements Walkable,Flyable,Swimmable{

    public Duck(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("duck is swimming...");
    }

    @Override
    public void fly() {
        System.out.println("duck is flying...");
    }

    @Override
    public void walk() {
        System.out.println("duck is walking...");
    }
}
