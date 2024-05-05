package oops;

import java.util.ArrayList;

public class OppArry {
     public static void main(String[] args) {
        int n=5;
        ArrayList <Integer>  arl=new ArrayList<Integer>(n);
        for (int i = 0; i <=n; i++) {
              arl.add(i);
              System.out.println(arl);
        }
        for (int j=0; j<arl.size(); j++ ){
            System.out.println(arl.get(j));
        }
     }
}
