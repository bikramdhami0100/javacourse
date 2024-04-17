import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromBuffer {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(inputStream);
        int a= Integer.parseInt( br.readLine());
        System.out.println(a);
    }
}
