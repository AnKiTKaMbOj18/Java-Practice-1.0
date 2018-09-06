package JavaInterview;


import java.util.Scanner;

public class PalindromeString {

    public static void palindrome(String str) {

        String rev="";
        System.out.println("length of input string is: "+str.length());

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse of input string is: "+rev);

        if(rev.equals(str)){
            System.out.println("Input string: "+str+" is palindrome as its reverse is same as input i.rev is: "+rev);
        }
        else
        {
            System.out.println("Input string: "+str+" is not palindrome as its reverse" +
                    " is not same as input i.e reverse is: "+rev);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check palindrome or not: ");
        String str = sc.nextLine();
        palindrome(str);
    }
}
