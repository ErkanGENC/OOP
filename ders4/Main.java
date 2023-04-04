package ders4;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        // BASİT ATM ÖRNEĞİ.

        Scanner scan = new Scanner(System.in);

        int bakiye = 1000;

        System.out.println("1-Para çekme");
        System.out.println("2-Para yatırma");
        System.out.println("3-bakiye görüntüleme");
        System.out.println("4-sistemden çıkma");

        while(true){

            System.out.println("\nYapmak istediginiz işlemi seçiniz: ");

            int islem = scan.nextInt();     // kullanıcıdan seçeceğimiz işlemi aldık.

            switch(islem) {
                case 1:
                    System.out.println("Ne kadar miktar çekeceksiniz: ");
                    int miktar = scan.nextInt();

                    bakiye -= miktar;
                    System.out.println("Kalan bakiyeniz: " + bakiye);
                    break;
                case 2:
                    System.out.println("Ne kadar miktar yatiracaksiniz: ");
                    miktar = scan.nextInt();

                    bakiye += miktar;
                    System.out.println("Kalan bakiyeniz: " + bakiye);
                    break;
                case 3:
                    System.out.println("Bakiyeniz: "+bakiye);
                    break;
                case 4:
                    System.out.println("Sistemden cikis yapiliyor...");
                    break;
                default:
                    System.out.println("Lutfen dogru tusu tuslayınız..!!");
            }
        }
    }
}
