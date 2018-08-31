package StreamsAndLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {

    public static void main(String[] args) {

        System.out.println("hello there");
        System.out.println(System.getProperty("java.version"));

        List<Integer> list=new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        for (Integer i:list) {
            System.out.println(i);
        }

        List<Integer> x=list.stream().map(data -> data*2).collect(Collectors.toList());
        System.out.println(x);
    }
}
