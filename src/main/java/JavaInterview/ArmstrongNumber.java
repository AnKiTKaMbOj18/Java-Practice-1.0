package JavaInterview;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void isArmstrong(int num){

        int a,b=0;
        int n=num;

        while(n!=0){

            a=n%10;
            n=n/10;

            b=b+a*a*a;
        }
        System.out.println(b);
        System.out.println(n);
        System.out.println(num);
        if(b==num){
            System.out.println("Entered number "+num + " is Armstrong ");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number is said to be armstrong shown below ex: number  407 is armstrong");
        System.out.println(7 * 7 * 7 + 0 * 0 * 0 + 4 * 4 * 4);
        System.out.println("Enter number to check armstrong or not");

        int num=sc.nextInt();

        isArmstrong(num);
    }
}
