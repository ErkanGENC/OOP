package ders10;


public class Main {
    public static void main(String[] args) {
        // OOP GİRİŞ CLASS VE CLASSIN FİELDS (ÖZELLİKLERİ)


      /*  car1.name = "megane";
        car1.color = "Siyah";
        car1.engineer = 1.5;

        System.out.println("Aracinizin ismin: "+car1.name+"\nAracinizin rengi: "+car1.color+"\naracinizin motor gücü: "+car1.engineer);
       */

        /*car1.setName("Doblo");
        car1.setColor("Siyah");
        car1.setEngineer(1.3);
        car1.setDoors(2);
        System.out.println("Aracinizin modeli: "+car1.getName()+"\nrengi: "+car1.getColor()+"\nmotor gücü: "+car1.getEngineer());
        System.out.println("Aracın kapı sayısı : "+car1.getDoors());

         */
        Car car1 = new Car("RENAULT","Siyah",1.6,3);
        car1.carInfos();
        Car car2 = new Car("doblo",3);
        car2.carInfos();
        Car car3 = new Car();
        car3.carInfos();
    }

}
