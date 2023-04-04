package ders22;

import java.util.*;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

        Collection<Animal> books = new LinkedList<>();

        Animal a1 = new Cat("Thomas");
        Animal a2 = new Duck("week");
        Animal a3 = new Eagle("dick");

        books.add(a1);
        books.add(a2);
        books.add(a3);

        Iterator iter = books.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.remove();
        }


    }


}
