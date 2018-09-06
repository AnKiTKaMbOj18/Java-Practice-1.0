package JavaInterview;

//Two strings are said to be anagram strings if they both contain same characters but there order can be different.
//for example: String a="abcd" and String b="bcda" they both are anagram strings.

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase().trim();
        s2 = s2.toLowerCase().trim();

        char[] c = s1.toCharArray();
        Arrays.sort(c);
        char[] d = s2.toCharArray();
        Arrays.sort(d);

        String first = new String(c);
        String second = new String(d);

        System.out.println("First String: "+first);
        System.out.println("Second String: "+second);

        if (first.equals(second)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.nextLine();
        System.out.println("Enter second String ");
        String str2 = sc.nextLine();
        boolean result = isAnagram(str1, str2);
        System.out.println((result) ? " Strings are Anagram" : "Strings are not Anagram");
    }
}
