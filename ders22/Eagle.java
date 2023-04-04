package ders22;

public class Eagle extends Animal implements Walkable,Flyable{

    public Eagle(String name){
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("Eagle is walking...");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying...");
    }
}
