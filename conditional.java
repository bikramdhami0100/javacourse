import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = choice.nextInt();
        // if (num%2==0) {
        // System.out.println("Number is Even");
        // } else {
        // System.out.println("Number is odd");
        // }
        switch (num) {
            case 1:
                System.out.println("Aalu parautaa");
                break;
            case 2:
                System.out.println("Momo");
                break;
            case 3:
                System.out.println("Chaumina");
                break;
            default:
                System.out.println("No item founds");
                break;
        }

    }
}
