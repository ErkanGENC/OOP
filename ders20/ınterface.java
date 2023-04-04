package ders20;


interface A{
    void a();
}
interface B{
    void b();
}
interface C extends A{
    void c ();
}
class D implements B,C{

    @Override
    public void a() {
        System.out.println("this is a ");
    }

    @Override
    public void b() {
        System.out.println("this is b");
    }

    @Override
    public void c() {
        System.out.println("this is c ");
    }
}
