package ders10;

public class Car { // PUBLİC TANIMLANAN ÖZELLİKLERE HER CLASS OLAŞIR ÖNEMLİ OLAN PRİVATE TANIMLAMAKTIR
    // PRİVATE OLMASI SADECE TANIMLANAN CLASSI ALAKADAR EDER.
    //public String name;
    //public double engineer;
    //public String color;
    private String name;
    private double engineer;
    private String color;
    private int doors;

    // setter getter fonksiyonlarını tanımlayıp onlar ile mainde ulaşım saglanır.
    // bu method encapsulation ile alakalıdır.

    public Car(String name,String color,double engineer,int doors){
        this.name = name;
        this.color = color;
        this.engineer= engineer;
        this.doors=doors;

    }
    public Car(String name,int doors){
        this(name,"null",0,doors);
    }
    public Car(){
        this("null","null",0,0);

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public void setEngineer(double engineer){
        this.engineer=engineer;
    }
    public double getEngineer(){
        return this.engineer;
    }
    public void setDoors(int doors){ // koşul olarak kapı sayısı 2 veya 4 olursa ulaşım saglansın.
       if(doors == 2 || doors == 4)
           this.doors = doors;
        else
           System.out.println("Kapı sayısı sadece 2 veya 4 girilebilir.");
    }
    public int getDoors(){
        return this.doors;
    }

    public void carInfos(){
        System.out.println("Arabanın ismi: "+this.name);
        System.out.println("Arabanın rengi: "+this.color);
        System.out.println("Arabanın kapı sayısı: "+this.doors);
        System.out.println("Arabanın motor gücü: "+this.engineer);

    }
}