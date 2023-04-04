package ders21;

public class CanonPro extends Printer implements ColoredPrintable,Faxable,Scannable{

    @Override
    public void print(){
        System.out.println("CannonPro printing...");
    }
    @Override
    public void Scan(){
        System.out.println(" CannonPro Scanning..");
    }
    @Override
    public void fax(){
        System.out.println("CannonPro Faxing..");
    }
    @Override
    public void colorprint(){
        System.out.println("CannonPro ColoredPrinting..");
    }
}
