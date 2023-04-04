package ders7;

public class Main {
    public static void main(String[] args) {

        // continue deyimi. ///soru : 0 dan 9 a kadar sayiları ekrana while ile bas ama 4 ve 5 atlansın.
        int i = 0 ;
        while (i<10){

            if(i == 4 || i == 5 || i== 8){ // 4 , 5 ve 8 sayilarini döngüden çıkardı.
                i++;
                continue;
            }
            System.out.println("i: "+i);
            i++ ;

        }


    }
}
