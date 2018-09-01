package JavaInterview;

import java.util.Scanner;

public class StrReverse {

    //reverse string method
    static void reverse(String str){

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
           rev= rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to reverse");
        String s=sc.nextLine();
        reverse(s);
    }
}
