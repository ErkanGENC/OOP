package ders25;

class Main{
    public static void main(String[] args){
        Worker w1 = new Engineer("newbie");
        Worker w2 = new ChiefEngineer("senior", 40);

        System.out.println(w1);
        System.out.println(w2);
    }
}