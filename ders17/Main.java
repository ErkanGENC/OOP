package ders17;

class Company{
     public void adress(){ // overriding
        System.out.println("this is default adress");
    }

}
class GoogleCompany extends Company{

      public void adress(){
        System.out.println("this is adress of Google");
    }
}
class MicrosoftCompany extends Company{
     public void adress(){
        System.out.println("this is adress of Microsoft");
    }
}


public class Main {
    public static void main(String[] args) {
// inheritance
    Company comp1 = new Company();
    comp1.adress();

    GoogleCompany comp2 = new GoogleCompany();
    comp2.adress();

    MicrosoftCompany comp3 = new MicrosoftCompany();
    comp3.adress();

    }
}
