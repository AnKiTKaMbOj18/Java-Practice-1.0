package Java_Collections;

//Java LinkedHashSet class is a Hash table and Linked list implementation of the set interface.
// It inherits HashSet class and implements Set interface.

//Contains unique elements only like HashSet.
//Provides all optional set operations, and permits null elements.
//Maintains insertion order.

import java.util.LinkedHashSet;

public class JLinkedhashset {

    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.contains(5));
        linkedHashSet.remove(5);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.hashCode());
        linkedHashSet.removeAll(linkedHashSet);
        System.out.println(linkedHashSet);
    }
}
