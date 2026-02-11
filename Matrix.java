//1.    Write a program to print the addition of 2 matrices in Java. 
import java.util.Scanner;
public class Matrix {
    
    private int [][]mat;
    public Matrix(int row, int col){
       mat = new int[row][col];
    }

    public void input(){
        java.util.Scanner scan = new Scanner(System.in);
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++)
                mat[i][j] = scan.nextInt();
        }
    }
    public void show(){
        for(int []row: mat){
            for(int d:row)
                System.out.print(d+" ");
            System.out.println();
        }
    }
    public void add(Matrix a, Matrix b){
        for(int i=0;i<mat.length; i++)
            for(int j=0; j<mat[i].length; j++)
                mat[i][j] = a.mat[i][j] + b.mat[i][j];
    }

    public static void main(String[] args) {
         System.out.println("The program is coded by Aditya Singh, 2400320100094");

        Matrix m1 = new Matrix(4, 4);
        Matrix m2 = new Matrix(4, 4);
        Matrix m3 = new Matrix(4, 4);
        System.out.println("Enter data in first matrix:");
        m1.input();
        System.out.println("Enter data in second matrix");
        m2.input();
        System.out.println("matrix 1:");
        m1.show();
        System.out.println("Matrix 2: ");
        m2.show();
        m3.add(m1, m2);
        System.out.println("Addition: ");
        m3.show();

    }    
}

