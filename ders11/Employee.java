package ders11;
// static keyword
public class Employee {
    public static String companyName = "MNG";
    private int id ;
    private String Name;
    static int number;

    public Employee(int id,String Name){
        this.id = id;
        this.Name = Name;
        number ++ ;
    }
    public void getInfo(){
        System.out.println(this.id+" "+ this.Name+" "+ Employee.companyName);
    }
}
