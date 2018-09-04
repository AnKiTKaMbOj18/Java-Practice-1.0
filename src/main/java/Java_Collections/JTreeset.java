package Java_Collections;

import java.util.TreeSet;

public class JTreeset {

    //Java TreeSet class implements the Set interface that uses a tree for storage.
    // It inherits AbstractSet class and implements NavigableSet interface.
    // The objects of TreeSet class are stored in ascending order.

    //The important points about Java TreeSet class are:
    //Contains unique elements only like HashSet.
    //Access and retrieval times are quiet fast.
    //Maintains ascending order.

    public static void main(String[] args) {



        TreeSet<Integer> treeSet1=new TreeSet<>();
        treeSet1.add(11);
        treeSet1.add(12);
        treeSet1.add(13);

        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.addAll(treeSet1);

        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.remove(5));
        System.out.println(treeSet);
        treeSet.removeAll(treeSet);
        System.out.println(treeSet);
    }
}
