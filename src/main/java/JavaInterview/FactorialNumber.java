package JavaInterview;

import java.util.Scanner;

public class FactorialNumber {

    public static void factorial(int number){

        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+ " is "+fact);
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int n=sc.nextInt();

        factorial(n);
    }
}
