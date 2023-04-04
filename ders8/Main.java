package ders8;

import java.util.Scanner;

public class Main {  // parametreli ve parametresiz fonksiyon tanımları ve kullanımı.

    public static void faktoriyel () { // faktoriyel bulma.

        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("Sayiyi girin: ");
            int sayi = scan.nextInt();

            int faktoriyel = 1;

            while (sayi > 0) {
                faktoriyel *= sayi;
                sayi--;

            }
            System.out.println("Faktoriyel sonucu: " + faktoriyel);
        }
    }

    public static void main(String[] args) {
        faktoriyel();

    }
}
