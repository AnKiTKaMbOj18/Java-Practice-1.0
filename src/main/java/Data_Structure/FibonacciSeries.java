package Data_Structure;


//Fibonacci series generates the subsequent number by adding two previous numbers.
// Fibonacci series starts from two numbers − F0 & F1.
// The initial values of F0 & F1 can be taken 0, 1 or 1, 1 respectively.

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum length for fibonacci Series");
        int n = sc.nextInt();
        int t1=0;
        int t2=1;
        int sum=0;
        System.out.println("First " + n + " terms: ");

        for (int i = 0; i < n; i++) {

            System.out.print(t1+" + ");

            sum=t1+t2;
            t1=t2;
            t2=sum;
        }

    }
}
