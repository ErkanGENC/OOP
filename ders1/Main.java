package ders1;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("küsürlü bir sayi giriniz: ");


        double a  = scan.nextDouble(); // 3.65 ? 3,65 ?
        System.out.println("girdiginiz sayi : "+a);

    }
}
