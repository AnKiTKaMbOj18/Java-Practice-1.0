package JavaInterview;

import java.util.Scanner;

public class Whitespace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //replace white space from string
        System.out.println("Enter first string ");
        String str1 = sc.nextLine();

        String withoutSpace = str1.replaceAll("\\s", "");
        System.out.println(withoutSpace);


    }
}
