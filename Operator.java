package javacourse;

public class Operator {
    public static void main(String[] args) {
        // assignment operator 
        int a=20;
         int b=200;
        //  System.out.println(++a);
        //  // unary operator 
        // //  a++; output = 21 post increment 
        // ++a; // pre increment
        //  System.out.println(a);

         // Relational Operator
         //this give always a true or false
         System.out.println(a!=b);
         System.out.println(a>=b);
         System.out.println(a==b);
         // Ternary Operator
         System.out.println(a>b?" a is greater than b ":"a is less the b");
        // logical Operator
         // &&->and, ||-> or and not->!
         //shift Operator
         // left shift << (num*2^shift) and right shift >> (num/2^shift)
          System.out.println(5>>2); // (num/ 2^shift)
          System.out.println(5/4);
          System.out.println(20<<2);
          // assignment Operator
          //variants 
        //   a=a+b;
        //   System.out.println(a);
          // short Hand Operators
          a+=b;
          System.out.println(a);
    }
}
