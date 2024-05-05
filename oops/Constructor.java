package oops;

public class Constructor {
    int rollNumber=8;
    String name="bikram dhami";
    //default constructor
    Constructor (){
        System.out.println("this is default Constructor");
    }
    //parameterized constructor
    Constructor (int a, String b){
         this.rollNumber=a;
         this.name=b;
        System.out.println("Name is : "+name+" and rollNumber is : "+rollNumber);
    }
    //copy Constructor
    Constructor (Constructor obj){
        System.out.println(obj.rollNumber + "and name is : "+obj.name);
    }
    public static void main(String args[]) {
         Constructor c=new Constructor();
         Constructor c2=new Constructor(22,"hello world");
         Constructor c3=new Constructor(c2);
         
    }
    
}
