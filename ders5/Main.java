package ders5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //while döngüsü (FAKTORİYEL ÖRNEĞİ)
        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1 ;

        System.out.println("Faktoriyeli alinacak sayiyi giriniz: ");
        int sayi = scan.nextInt();

        while(sayi>=1){

            faktoriyel *= sayi;

            sayi--;

        }
        System.out.println("Faktoriyel sonucu: "+faktoriyel);
    }
}
