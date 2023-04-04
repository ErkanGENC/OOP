package ders14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // main içerisinde bi throw new exception yolla.classız !!

        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Lutfen 0 ile 100 arasında bir sayı giriniz: ");
            int num = scan.nextInt();
            if(num<0 || num >100)
                throw new Exception("100  ve 100 den fazla sayi girdiniz.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("lutfen girdiğiniz tip ile var olan tipe dikkat ediniz.");
        }
        catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
        finally{
            System.out.println("done!");
        }

    }
}
