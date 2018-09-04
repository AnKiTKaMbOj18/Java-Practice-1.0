package Java_Collections;


//Java deque interface: Java Deque Interface is a linear collection that supports element
// insertion and removal at both ends. Deque is an acronym for "double ended queue".

//ArrayDeque class :The ArrayDeque class provides the facility of using deque and resizable-array.
// It inherits AbstractCollection class and implements the Deque interface.

//The important points about ArrayDeque class are:
//Unlike Queue, we can add or remove elements from both sides.
//Null elements are not allowed in the ArrayDeque.
//ArrayDeque is not thread safe, in the absence of external synchronization.
//ArrayDeque has no capacity restrictions.
//ArrayDeque is faster than LinkedList and Stack.

import java.util.ArrayDeque;

public class JDeque {


    public static void main(String[] args) {

        ArrayDeque<Integer> deque =new ArrayDeque<>();
        deque.add(6);
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);

        System.out.println(deque);

        deque.addFirst(7);
        deque.addLast(8);
        System.out.println(deque);
        System.out.println(deque.size());
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque.element());
        System.out.println(deque.remove());
        System.out.println(deque.removeAll(deque));
        System.out.println(deque.size());
        System.out.println(deque);
    }
}
