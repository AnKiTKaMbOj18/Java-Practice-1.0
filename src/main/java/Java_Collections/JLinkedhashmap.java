package Java_Collections;

import java.util.LinkedHashMap;

//Java LinkedHashMap class is Hash table and Linked list implementation of the Map interface,
// with predictable iteration order. It inherits HashMap class and implements the Map interface.

//The important points about Java LinkedHashMap class are:
//A LinkedHashMap contains values based on the key.
//It contains only unique elements.
//It may have one null key and multiple null values.
//It is same as HashMap instead maintains insertion order.

public class JLinkedhashmap {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(104,"arun");
        map.put(102,"bindra");
        map.put(103,"mandeep");
        map.put(101,"rahul");
        map.put(null,null);
        System.out.println(map);
        map.remove(102);
        System.out.println(map);
    }
}
