package Java_Collections;

//Java Map Interface
//A map contains values on the basis of key i.e. key and value pair.
// Each key and value pair is known as an entry. Map contains only unique keys.
//Map is useful if you have to search, update or delete elements on the basis of key.

//Java Map Hierarchy
//There are two interfaces for implementing Map in java: Map and SortedMap,
// and three classes: HashMap, LinkedHashMap and TreeMap. The hierarchy of Java Map is given below:

//Map doesn't allow duplicate keys, but you can have duplicate values.
// HashMap and LinkedHashMap allows null keys and values but TreeMap doesn't allow any null key or value.

//Map can't be traversed so you need to convert it into Set using keySet() or entrySet() method.

import java.util.HashMap;

public class JHashmap {

    public static void main(String[] args) {

        //Java HashMap class hierarchy
        //Java HashMap class implements the map interface by using a hashtable.
        // It inherits AbstractMap class and implements Map interface.
        //The important points about Java HashMap class are:
        //A HashMap contains values based on the key.
        //It contains only unique elements.
        //It may have one null key and multiple null values.
        //It maintains no order.

        HashMap<Integer,String> map=new HashMap<>();
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
