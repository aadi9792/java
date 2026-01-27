
// wap a program to enter a choice by user 1 for add, 2 for sub ,3 for divide, 4 for power, 5 for exit

import java.util.Scanner;

public class frist {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("enter choice less than 6");
        c = sc.nextInt();
        while(c<5){
            if(c == 1){
               System.out.println(a+b);
               break;
            }
            else if(c == 2){
                System.out.println(a-b);
                break;
            }
            else if (c==3){
                System.out.println(a/b);
                break;
            }
            else if(c==4){
                int d = 1;
                for(int i = 1;i<=b;i++){
                    d = d*a;
                }
                System.out.println(d);
                break;
            }
        }

        

    }
}
