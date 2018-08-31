package StreamsAndLambdas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Streams2 {
    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();

        map.put(1,"ankit");
        map.put(2,"varun");
        map.put(3,"ragu");
        map.put(4,"mandeeep");
        map.put(5,"kieron");

        //iterating over map using java for each loop
        System.out.println("Iterating using java foreach loop");
        for (Map.Entry<Integer,String> entry:map.entrySet()) {
            System.out.println("Key: "+entry.getKey()+ " "+ "Value: "+entry.getValue());
        }

        //iterating over map using java iterator
        System.out.println("Iterating using java iterator");
        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println("Key: "+entry.getKey() +" "+ "Value: "+entry.getValue());
        }

        //iterating using java streams
        System.out.println("Iterating using java8 streams");
        map.entrySet().stream().forEach(entry->{
            System.out.println("Key: "+entry.getKey() +" "+ "Value: "+entry.getValue());
        });

        //iterating using java lambdas
        System.out.println("Iterating using java8 lambdas");
        map.forEach((k,v)->{
            System.out.println("Key: "+k +" "+ "Value: "+v);
        });
    }
}
