package JavaInterview;


import java.util.Scanner;

public class SumOfMatrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows,cols,i,j,first[][],second[][],sum[][];

        System.out.println("Enter number of rows for matrix");
        rows=sc.nextInt();
        System.out.println("Enter number of cols for matrix");
        cols=sc.nextInt();

        first=new int[rows][cols];
        second=new int[rows][cols];
        sum=new int[rows][cols];

        System.out.println("Enter Elements of first matrix i.e rows,cols elements");
        for(i=0;i<rows;i++){

            for(j=0;j<cols;j++){
                first[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Elements of second matrix i.e rows,cols elements");
        for(i=0;i<rows;i++){

            for(j=0;j<cols;j++){
                second[i][j]=sc.nextInt();
            }
        }

        System.out.println("To find sum of two matrices: ");

        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++) {

                sum[i][j] = first[i][j] + second[i][j];  //replace + with - to subtract two matrices
            }
        }

        System.out.println("Sum of two matrices is: ");

        for(i=0;i<rows;i++){

            for(j=0;j<cols;j++){

                System.out.print(sum[i][j]+" \t");
            }
            System.out.println();
        }
    }
}
