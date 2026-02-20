import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
       try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number");
        int roll=sc.nextInt();
        if(roll<0){
            throw new Exception("roll number should be positive");
        }
        System.out.println("enter percentage of marks");
        int mark=sc.nextInt();
        if(mark<0||mark>100){
            throw new Exception("marks should be between 0 to 100");
        }
        System.out.println("Roll :"+roll);
        System.out.println("Percentage of marks"+mark);
        
       } 
       catch (Exception e){
        System.out.println(e.getMessage());
       }
}
}