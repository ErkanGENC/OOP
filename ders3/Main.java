package ders3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // iki string ifadenin karşılaştırılması.

    String kul_Adi = "KtcnN";
    String parola = "159852147";

    Scanner scan = new Scanner(System.in);

    while(true){

        System.out.println("Kullanici adini giriniz: ");
        String kullaniciAdi = scan.nextLine();

        System.out.println("Parolayi giriniz: ");
        String parola1 = scan.nextLine();

        if((kul_Adi.equals(kullaniciAdi)) && (parola.equals(parola1)) ) {
            System.out.println("Kullanici adi ve parola eşleşmesi doğru.");
        }
        else if(!(kul_Adi.equals(kullaniciAdi)) && (parola.equals(parola1))) {
            System.out.println("Kullanici adini tekrar deneyiniz.");
        }
        else if((kul_Adi.equals(kullaniciAdi)) && !(parola.equals(parola1))) {
            System.out.println("Parolanizi tekrar deneyiniz.");
        }
        else
            System.out.println("parola ve kullanici adinizi tekrar deneyiniz.");

    }

    }
}
