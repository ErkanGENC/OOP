package ders2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
while(true){

    System.out.println("BİR NOT GİRİNİZ: ");

    int a = scan.nextInt();

    if(a > 70 ) {
        System.out.println("derstten geçtiniz.");
        break;
    }
    else
        System.out.println("derstten kaldiniz.\n");


}
    }
}
