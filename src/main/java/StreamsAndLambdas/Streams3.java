package StreamsAndLambdas;

import java.util.Arrays;

public class Streams3 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};

        for (Integer a:arr) {
            System.out.println(a);
        }

        System.out.println("Iterating over array using java streams");
        Arrays.stream(arr).map(data->data).forEach(System.out::println);


        System.out.println("iterating over array using java lambdas");
        Arrays.stream(arr).forEach(System.out::println);

        int[] x=new int[10];
        for(int i=1;i<x.length;i++){
            x[i]=i;
        }
        System.out.println("Iterating over array using streams");
        Arrays.stream(x).forEach(data->System.out.print(data));
    }
}
