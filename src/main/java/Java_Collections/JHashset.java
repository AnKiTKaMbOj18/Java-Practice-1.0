package Java_Collections;

//Set interface implements collections interface
//set has further classes i.e HashSet,TreeSet,LinkedTreeSet

//HashSet:Java HashSet class is used to create a collection that uses a hash table for storage.
// It inherits the AbstractSet class and implements Set interface.
//The important points about Java HashSet class are:
//HashSet stores the elements by using a mechanism called hashing.
//HashSet contains unique elements only.

//List can contain duplicate elements whereas Set contains unique elements only.

import java.util.HashSet;

public class JHashset {

    public static void main(String[] args) {

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(1);

        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.size());
        hashSet.remove(5);
        System.out.println(hashSet);
        hashSet.removeAll(hashSet);
        System.out.println(hashSet);

    }
}
