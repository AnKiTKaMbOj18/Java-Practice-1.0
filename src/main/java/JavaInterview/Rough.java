package JavaInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rough {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rough r=new Rough();
        System.out.println(r.getClass());

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"abc");
        map.put(2,"abc");
        map.put(3,"ghi");

        System.out.println(map);
    }
}
