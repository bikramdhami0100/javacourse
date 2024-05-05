package oops;
//encapsulation
import java.lang.*;
 class Cars {
 private int carnum=1001;
 private int modelno;
 private String carcolor;
 void speed(){
    System.out.println("the speed of car is 20km/hr");
 }
private void carShow(){
    
    modelno=101;
    carcolor="red";
    System.out.println("your car no is "+carnum+"and model is "+modelno+"and color is "+carcolor);
 }
 public static void main(String[] args) {
    Cars cr=new Cars();
     
        cr.carShow();
 }
   
}
class Test{
    public static void main(String[] args) {
        Cars cr=new Cars();
        // cr.carShow(); //private is not access by this  class
        cr.speed();
    }
}
