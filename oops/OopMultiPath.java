package oops;

public class OopMultiPath  {
    public static void main(String[] args) {
         AllClassShow obj=new AllClassShow();
         obj.showMe();
         obj.shoOne();
         obj.showTwo();
    }
}
 class MyParent {
  public void showMe(){
    System.out.println("this is parent class in java");
  }
    
  
}

/**
 * NewInterface
 */
interface NewInterface {
 public void shoOne();
 public void showTwo();
    
}
class AllClassShow extends MyParent implements NewInterface{

    @Override
    public void shoOne() {
        System.out.println("this is show One function from implement");
       
    }

    @Override
    public void showTwo() {
        System.out.println("this is show tow from interface");

    }

}