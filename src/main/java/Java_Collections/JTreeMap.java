package Java_Collections;


//Java TreeMap class implements the Map interface by using a tree.
// It provides an efficient means of storing key/value pairs in sorted order.

//The important points about Java TreeMap class are:
//A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
//It contains only unique elements.
//It cannot have null key but can have multiple null values.
//It is same as HashMap instead maintains ascending order.

import java.util.TreeMap;

public class JTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(104,"arun");
        map.put(102,"bindra");
        map.put(103,"mandeep");
        map.put(101,"rahul");

        System.out.println(map);
        map.remove(102);
        System.out.println(map);

    }
}
