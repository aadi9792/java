import java.util.Scanner;
public class learning_object {
    public static void main(String[] args) {
    // Student Aadi = new Student(); 
    
    // Student Aadi = new Student(3,"aditya",78.4f); 
    // System.out.println(Aadi.name);
    // Student.call();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rollno :");
    int roll_no = sc.nextInt();

    sc.nextLine();

    
    System.out.println("enter name :");
    String name = sc.nextLine();
    System.out.println("enter marks :");
    float marks = sc.nextFloat();

    Student Aadi = new Student(roll_no,name,marks);
    System.out.println(Aadi.name);

    }
    

}
class Student {
    int roll;
    String name;
    float marks;

    static void call(){
        System.out.println("hello");
    }
    

    Student(int roll,String name,float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}