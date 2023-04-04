package ders20;

public class Main {
    public static void main(String[] args) { // interface abstraction ve multiple inheritance için gerekli.

        B b = new D();
        b.b();
        // b'nin içinden c cagıralım.
        ((C)b).c();// downcasting

    }
}
