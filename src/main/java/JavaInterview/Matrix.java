package JavaInterview;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        System.out.println("Matrix");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols");
        int cols = sc.nextInt();

        int[][] matrix=new int[rows][cols];

        System.out.print("Enter matrix data: ");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
