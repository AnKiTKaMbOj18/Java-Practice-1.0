package Java_Collections;

import java.util.ArrayList;

//List Interface is the subinterface of Collection.
// It contains methods to insert and delete elements in index basis.It is a factory of ListIterator interface.
//List interface has classes i.e ArrayList and LinkedList which implements List<> Interface.
public class JArraylist {


    public static void main(String[] args) {

        //can contain duplicates
        //maintains insertion order
        //non synchronised
        //allows random access as arrays works on index basis
        //manipulation is slow because lots of shifting occurs when element is removed from list

        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);


        System.out.println(arrayList);
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList);

    }
}
