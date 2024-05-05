
 public class ParentPractice {
 
  private int a=100;
  public int displayInt() {
      return a;
  }
  public static void main(String[] arg){
      Practice obj=new Practice();
     int b= obj.displayInt();
     System.out.println(b);
     obj.showMe();
  }
    
 }
 class Practice extends ParentPractice{
    public void showMe(){
        System.out.println("this is show function from parentpractice");
    
      }
}