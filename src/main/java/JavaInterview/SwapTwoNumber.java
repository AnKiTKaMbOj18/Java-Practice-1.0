package JavaInterview;

import java.util.Scanner;

public class SwapTwoNumber {

    public static void swap(int a, int b) {

        System.out.println("first way: ");

        System.out.println("value of a before swapping is a= "+a);
        System.out.println("value of b before swapping is b= "+b);

        //first way of swapping
        int n,k=a,l=b;

        n=a;
        a=b;
        b=n;

        System.out.println("value of a after swapping is a= "+a);
        System.out.println("value of b after swapping is b= "+b);

        //second way of swapping

        System.out.println("Second way: ");

        System.out.println("value of k before swapping is k= "+k);
        System.out.println("value of l before swapping is l= "+l);

        k=k+l;
        l=k-l;
        k=k-l;

        System.out.println("value of k after swapping is k= "+k);
        System.out.println("value of l after swapping is l= "+l);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number for swapping");
        int a = sc.nextInt();

        System.out.println("Enter Second number for swapping");
        int b = sc.nextInt();

        swap(a, b); //swapping of two numbers
    }
}
