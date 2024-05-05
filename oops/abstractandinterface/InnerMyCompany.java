package oops.abstractandinterface;

abstract class MyCompany {
    // void showName(){
    //     System.out.println("this is simple function");
    // }
    abstract void showData();
}
/**
 * InnerMyCompany
 */
public class InnerMyCompany  extends MyCompany{

    @Override
    void showData() {
      System.out.println("this is inhearited from abstract class");
    }

    
}
