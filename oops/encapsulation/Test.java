package oops.encapsulation;

public class Test {
    public static void main(String[] args) {
        Employee em=new Employee("bikram dhami",98000000);
       System.out.println(em.showName());
       System.out.println(em.showPhoneNumber());
       em.setName("bikram one");
       em.setPhoneNumber(9700000);
       System.out.println(em.showName());
       System.out.println(em.showPhoneNumber());
    //    System.out.println(em.salary);
    }
}
