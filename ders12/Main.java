package ders12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // arrayler.

        int [] arr1 = {1,34,6,43,7}; // ya da

        int [] arr2 = new int[5]; // 5 hafızalı bir array.

       /* arr2[0]=45;
        arr2[1]=31;
        arr2[2]=22;
        arr2[3]=43;
        arr2[4]=78;
        System.out.println("dizinin 0.indisi: "+arr2[0]);
        System.out.println("dizinin 1.indisi: "+arr2[1]);
        System.out.println("dizinin 2.indisi: "+arr2[2]);
        System.out.println("dizinin 3.indisi: "+arr2[3]);
        System.out.println("dizinin 4.indisi: "+arr2[4]);


        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
*/
        Scanner scan = new Scanner(System.in);

        System.out.println("kullanıcıdan elemanlar alınıyor..");

        for(int i=0 ; i< arr2.length;i++){

            arr2[i]=scan.nextInt();
        }
        System.out.println("Elemanlar ekrana yazdiriliyor...");

        for(int i=0;i< arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
