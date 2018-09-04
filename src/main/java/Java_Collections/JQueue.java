package Java_Collections;

import java.util.PriorityQueue;

public class JQueue {
    //Java Queue interface orders the element in FIFO(First In First Out) manner.
    // In FIFO, first element is removed first and last element is removed at last.

    public static void main(String[] args) {

        //The PriorityQueue class provides the facility of using queue.
        // But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.

        PriorityQueue<String> priorityQueue=new PriorityQueue<>();
        priorityQueue.add("amit");
        priorityQueue.add("vinet");
        priorityQueue.add("amit");
        priorityQueue.add("rajan");
        priorityQueue.add("karan");
        priorityQueue.add("sajan");
        priorityQueue.add("rajan");

        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue);
        System.out.println("head "+priorityQueue.element());
        System.out.println("head "+priorityQueue.peek());
        System.out.println(priorityQueue.remove("sajan"));
        System.out.println(priorityQueue);
        priorityQueue.remove("rajan");

        for(String str: priorityQueue){
            System.out.println(str);
        }
        priorityQueue.remove();
        System.out.println(priorityQueue);
        priorityQueue.poll();
        System.out.println(priorityQueue);
        priorityQueue.removeAll(priorityQueue);
        System.out.println(priorityQueue);
    }
}
