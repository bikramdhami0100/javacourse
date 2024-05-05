package oops.abstractandinterface;

/**
 * Company2
 */
 interface Company2 {
 void showEmployeeDetail();
 void showMarketCondition();
    
} 
class MyCompany2 implements  Company2{
    public void showEmployeeDetail(){
          System.out.println("this is employee detail");
    }
   public void showMarketCondition(){
     System.out.println("this is market details of company");
    }
}


