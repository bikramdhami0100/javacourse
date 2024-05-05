package filehandeling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MyFile {
    
   public static void main(String[] args) throws Exception {
    File fl=new File("bikram.txt");
    FileWriter fw=new FileWriter(fl);
    BufferedWriter fb=new BufferedWriter(fw);
    fb.write("this is bikram dhami from bajhang");
    fb.close();
     FileReader fr=new FileReader("bikram.txt");
    BufferedReader br=new BufferedReader(fr);
     System.out.println( br.read());
     br.close();

   }
}
