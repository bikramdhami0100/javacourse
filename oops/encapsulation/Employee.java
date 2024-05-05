package oops.encapsulation;

public class Employee {
    private String name;
    private long phoneNumber;
    private int bankAccount;
    // public int salary;
    private int salary;
      Employee(String name,long phone){
         this.name=name;
         phoneNumber=phone;
      }
    String showName(){
        return name;
    }
    long showPhoneNumber(){
        return phoneNumber;
    }
    String setName(String name){
      return this.name=name;
    }
    long setPhoneNumber(long phone){
        return phoneNumber=phone;
    }

}
