package ders18;

public  class Animal {

    public void eat()
    {
        System.out.println("animal is eating.");
    }
}
 class Dog extends Animal {
@Override
    public void eat(){
        System.out.println("Dog is eating.");
    }
     public void bark(){
         System.out.println("Dog is barking.");
     }
}
 class Cat extends Animal {
     @Override
    public void eat(){
        System.out.println("Cat is eating.");
    }
     public void meuw(){
         System.out.println("Cat is meuwwwwwww.");
     }
}
class Horse extends Animal {
    @Override
    public void eat(){
        System.out.println("Horse is eating.");
    }
    public void walk(){
        System.out.println("Horse is walking.");
    }
}


