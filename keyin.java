import java.util.Scanner;

public class keyin {
    public static void main(String []args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter frist number");
        a = scan.nextInt();
        System.out.println("enter second number");
        b = scan.nextInt();
        c =a+b;
        System.out.println("sum is :"+c);
    }
}
