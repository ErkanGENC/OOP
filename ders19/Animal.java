package ders19;

public class Animal {
    protected String color;

    void eat(){
        System.out.println("Animal eating");
    }
}
class Cat extends Animal{
    int age ;

    @Override
    void eat() {
        System.out.println("cat is eating");
    }
    void meuw(){}
}
