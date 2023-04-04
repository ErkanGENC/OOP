package ders22;

public class Cat extends Animal implements Swimmable,Walkable{

   public  Cat(String name ){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Cat is swimming...");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking...");
    }
}
