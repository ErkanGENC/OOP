package ders21;

public class CannonOffice extends Printer implements Faxable,Scannable{
    @Override
    public void print() {
        System.out.println("Cannonoffice printing...");
    }

    @Override
    public void fax() {
        System.out.println("CannonOffice faxing...");
    }

    @Override
    public void Scan() {
        System.out.println("CannonOffice Scanning");
    }
}
