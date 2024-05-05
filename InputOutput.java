
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Command Line Arguments
        
        // System.out.println(args[0]);
        // PS D:\Program Files\javacourse> java InputOutput.java 1000
        // output ->1000
        // System.out.println(args[1]);
        // PS D:\Program Files\javacourse> java InputOutput.java 1000 200
        // 1000
        // 200
        System.out.printf("%d",33);
        System.out.printf("%f",44.4f);
        SimpleDateFormat date=new SimpleDateFormat("yyyy-mm-dd");
        String str1=date.format(new Date());
        System.out.println(new Date());
        System.out.println(str1);
        // Scanner using 
        Scanner scanner=new Scanner(System.in);
        float ft=scanner.nextFloat();
        // same for int,float ,double ,long ,short and byte
        System.out.println("output "+ft);
        //but different in string and char
       System.out.println("Enter your name");
       scanner.nextLine();
       String str=scanner.nextLine();
       System.out.println(str);
       System.out.println("enter char ");
    //    scanner.nextLine();
       char ch=scanner.next().charAt(1);
       System.out.println(ch);
       //BufferReading  input-output from files Readers
       

    }
}
