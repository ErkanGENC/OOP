package ders25;

abstract class Worker {
    private String name;
    protected int hour;
    protected int wage;
    public Worker(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }

    public Worker(String name){
        this.name = name;
    }
    abstract int Salary();
    @Override
    public String toString() {
        return name +" "+ this.Salary();
    }

    int baseSalary(){
        return 1000;
    }
}
class Engineer extends Worker{
    public Engineer(String name) {
        super(name);
        this.hour =10;
        this.wage = 50;
    }
    @Override
    int Salary() {
        return this.hour * wage +
                super.baseSalary();
    }
}
class ChiefEngineer extends Worker{
    public ChiefEngineer(String name, int hour) {
        super(name, hour);
        this.wage = 20;
    }
    @Override
    int Salary() {
        return this.hour * wage * 2 +
                super.baseSalary();
    }
}