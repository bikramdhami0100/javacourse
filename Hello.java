
public class Hello {
    public static void main(String[] args) {
        // byte bt=12;
        // short st=11111;
        // int in=111111111;
        // long lg=1111111111;
        // float ft=111.222f;
        // double db=100.44444;
        // Byte bt=12;
        // Short st=11111;
        // Integer in=111111111;
        // // Long lg=1111;
        // Float ft=111.222f;
        // Double db=100.44444;
        // System.out.println( bt+st+in+ft + db);
        // type casting 
        //automatically type casting
        float ft2= 22.33f;
        double db2=ft2;
        long lg2= (long) ft2;
        System.out.println(ft2);
        System.out.println(db2);
        // manual type casting
        float ft3= 22.33f;
       
        long lg3= (long) ft2;
        System.out.println(lg3);
        //advance type casting 
         int a=100;
         String str=String.valueOf(a);
         String str2=String.valueOf(ft3);
         System.out.println(a+str);
         System.out.println(ft3+str2);

        // non primitive to primitive 
        String str3="22";
        // int it4= 2000;
        //  String stss=String.valueOf(it4);
        //  System.out.println(stss+stss);
         Double num =Double.parseDouble(str3);
        System.out.println(num+num);
    }
}
