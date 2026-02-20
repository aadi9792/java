class Student {

    
    int rollNo;
    String name;

    
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

   
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        System.out.println("Program coded by Aditya Singh , 2400320100094");

        
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Amit");

        
        System.out.println("\nStudent 1 Details:");
        s1.display();

        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}

