package StreamsAndLambdas;

import java.util.Comparator;

public class Lambda1 {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        };
        int comp1 = comparator.compare("hello", "a");
        System.out.println(" comparison using simple compator method, result: " +comp1);

        Comparator<String> comparator1 = String::compareTo;

        int comp2 = comparator1.compare("hello", "a");
        System.out.println(" comparison using method reference way, result: "+comp2);

        Comparator<String> comparator2 = (o1,o2) -> {
            return o1.compareTo(o2);
        };
        int comp3 = comparator2.compare("hello", "a");
        System.out.println(" comparison using java 8 lambdas, result: "+comp3);
    }
}
