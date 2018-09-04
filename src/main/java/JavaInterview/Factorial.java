package JavaInterview;

import java.util.Scanner;

public class Factorial {

    public static void factorial(int number){

        int fact=1;
        for(int i=number;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int num=sc.nextInt();
        factorial(num);

    }
}
