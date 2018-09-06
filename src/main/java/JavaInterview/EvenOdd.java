package JavaInterview;

import java.util.Scanner;

public class EvenOdd {

    public static void evenOdd(int number){

        if(number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even or odd");
        int n=sc.nextInt();

        evenOdd(n);

    }
}
