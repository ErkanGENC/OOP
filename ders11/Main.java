package ders11;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new  Employee(456,"Jack");
        System.out.println(e1.number);
        Employee e2 = new Employee(789,"Jane");



        System.out.println(e2.number);


        System.out.println(Employee.number);

    }
}
