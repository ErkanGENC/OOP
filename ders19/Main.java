package ders19;

public class Main {
    public static void main(String[] args) {

        Animal a = new Cat();


        ((Cat)a).meuw();
        Object o = new Animal();

        ((Animal)o).eat(); // downcasting






    }
}
