package Java_Collections;

import java.util.LinkedList;

public class JLinkedlist {

    public static void main(String[] args) {

        //
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("abc");
        linkedList.add("abc");
        linkedList.addFirst("Hello Linked List");
        linkedList.add(1, "Whats Up");

        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.remove();
        System.out.println(linkedList);
        linkedList.add("yes");
        System.out.println(linkedList);
        linkedList.removeAll(linkedList);
        System.out.println(linkedList);
    }
}
