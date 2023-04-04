package ders15;

   class outerClass{   // NESTED CLASSES

        int x = 10;

        class InnerClass{
            int y = 5;
        }

    }


public class Main {
    public static void main(String[] args) {

        outerClass Myouter = new outerClass(); // dıştaki class için nesne oluşturuldu.
        outerClass.InnerClass MyInner = Myouter.new InnerClass();   // içteki class için nesne oluşumu.

        System.out.println("Y = "+MyInner.y+ " X = "+Myouter.x);
    }
}
