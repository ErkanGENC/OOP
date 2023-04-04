package ders13;


import java.util.Scanner;

public class Main {                                     // try-catch-finally ifadeleri.
    public static void main(String[] args) {            // simdi hata mesajı oluşturmayla ilgili bir proje yapalım.


        try{
            Time time1 = new Time(30,15,23);

            System.out.println(time1.run());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done!");
        }

    }
}
