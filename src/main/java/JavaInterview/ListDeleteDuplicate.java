package JavaInterview;

import java.util.ArrayList;
import java.util.HashSet;

public class ListDeleteDuplicate {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghe");
        list.add("abc");
        list.add("ijk");
        list.add("lmn");
        list.add("ghe");

        //printing list with duplicate elements
        System.out.println("ArrayList with duplicate elements: ");
        System.out.println(list);

        //creating HashSet using list
        HashSet<String> set=new HashSet<>(list);

        System.out.println("HashSet: "+set);
        //creating ArrayList using set

        ArrayList<String> arrayList=new ArrayList<>(set);

        //printing list without duplicate elements
        System.out.println("ArrayList after removing duplicate elements: ");
        System.out.println(arrayList);

    }
}
