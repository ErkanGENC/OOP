package ders6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //do -while kullanarak girilen sayinin rakamlarının toplamını bulma.

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayiyi girin: ");
        int sayi = scan.nextInt();
        int toplam = 0;
        // 1673
        do {
            toplam += sayi%10;
            sayi = sayi/10;

            System.out.println("sayi : "+sayi+" toplam: "+toplam);
        }
        while(sayi>0);

        System.out.println("\ntoplam degeri : "+toplam);
    }
}
