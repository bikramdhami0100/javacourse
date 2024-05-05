package oops;

public class Boxing {
   
    public static void main(String[] args) {
        //wrapper class
        int a=10;
        Integer b=a;// Auto boxing
        // Integer c=Integer.valueOf(a);
        // System.out.println(a+b+c);
        System.out.println("b : "+b);

        //boxing 
        Integer c=new Integer(10);
        int d=c; //unboxing
        // int e=c.intValue();
        System.out.println(d);
    }
}
