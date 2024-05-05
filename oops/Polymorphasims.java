package oops;

public class Polymorphasims {
    // compile time polymorphisms or function overloading
    public void pringInfo(String name){
        System.out.println("name is : "+name);
    }
    public void pringInfo(int age){
        System.out.println("age is : "+age);
    }
    public void pringInfo(String name , int age){
        System.out.println("name is : "+name + "and age is " +age);
    }
    public static void main(String[] args) {
        Polymorphasims p=new Polymorphasims();
        p.pringInfo(22);
        p.pringInfo("bikram dhami");
        p.pringInfo("bikram dhami",22);
    }
    
}
