package ders18;

public class Main {
    public static void main(String[] args) { // typecasting - downcasting

        Animal d1 = new Dog();

        Animal d2 = new Horse();

        ((Horse)d2).walk();

        ((Dog)d1).bark(); // downcasting

        //d1.bark();
        d1.eat();

    }
}
