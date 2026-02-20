import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number");
        int count=sc.nextInt();

        int[] arr={10,20,30,40,50};

        int sum=0;
        // int count=0;
        for(int i=0;i<count;i++){
            sum+=arr[i];
            
            System.out.println("Sum is: "+sum);

        }
        float avg=sum/count;
        System.out.println("Average is: "+avg);
    }
    catch(Exception e){
        System.out.println("Error: "+e.getMessage());
    }
    }
}