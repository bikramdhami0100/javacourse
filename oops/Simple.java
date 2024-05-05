package oops;

import java.io.*;
/**
 * Simple
 */
public class Simple {
public static void main(String[] args) {
    try {
    
    FileWriter fw=new FileWriter("abc.txt");
    fw.write("My name is bikram");
    fw.close();
    } catch (Exception e) {
        System.out.println(e);
        // TODO: handle exception
    }
}
    
}
    
