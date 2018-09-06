package JavaInterview;

import java.util.Scanner;

public class PrimeNumber {

    public static void prime(int n){

        int i=2;
        for(i=2;i<10;i++){

            if(n%i==0 && n!=i){
                System.out.println("entered number "+n+ " is not prime");
                break;
            }
        }
        if(i==10){
            System.out.println("Entered number "+n+" is prime number");
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Number is said to be prime if it is divisible by 1 and by it's self example: 5 ");
        System.out.println("Enter number greater than 2 to check whether it is prime or not: ");
        int number=sc.nextInt();

        prime(number);
    }
}
