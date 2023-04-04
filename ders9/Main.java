package ders9;

public class Main {   //  overloading method

    public static void person(String name,int id){
        System.out.println("kullanıcının ismi : "+ name+ "\nKullanıcının id'si: "+id);
    }
    public static void person(String name,int id,String color){
        System.out.println("kullanıcının ismi : "+ name+ "\nKullanıcının id'si: "+id+ "\nKişinin rengi: "+color);
    }
    public static void main(String[] args) {
        person("Erkan",123);
        System.out.println("\n");
        System.out.printf("\n");
        person("Ezgi",2123,"Beyaz");

    }
}
