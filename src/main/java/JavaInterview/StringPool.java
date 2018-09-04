package JavaInterview;

/*
    As the name suggests, String Pool in java is a pool of Strings stored in Java Heap Memory.
    We know that String is special class in java and we can create String object using new operator
     as well as providing values in double quotes.
*/

public class StringPool {

    public static void main(String[] args) {

        String s1="abc";
        String s2="abc";
        String s3=new String("abc");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s2==s3);
        System.out.println(s1==s3);
    }
}
