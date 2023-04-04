package ders21;

public class CanonBasic extends Printer implements Scannable{
    @Override
    public void print(){
        System.out.println("CanonBasic printing...");
    }
    @Override
    public void Scan(){
        System.out.println("CanonBasic Scanning...");
    }

}
