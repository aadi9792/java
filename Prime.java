import java.util.Scanner;
class Prime {
    public static void main(String[] args) {

        System.out.println("The program is coded by Aditya Singh, 2400320100094");

        if(args.length == 0){
            System.out.println("Please provide a number as command line argument");
            return;
        }

        int n = Integer.parseInt(args[0]);

        int count = 0;

        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }
    }
}



