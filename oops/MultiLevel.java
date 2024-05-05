package oops;

public class MultiLevel  {
    public static void main (String[] arg){
         MyParent obj=new MyParent();
         System.out.println(obj.displayNum());
         MyChildren obj2=new MyChildren();
         System.out.println(obj2.showTotalNum());
    }
}
class MyParent {
 public int a=100;
    public int displayNum(){
        return a;
    }
}
/**
 * Children
 */
 class MyChildren  extends MyParent{
   public int b=100;
    public int showTotalNum(){
        return a+b;
    }
    
}

