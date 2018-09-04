package Java_Collections;

import java.util.Collection;
import java.util.Iterator;

//Java  collections represents a single unit of objects  i.e a group.
public class JCollection {


    public static void main(String[] args) {

        //collection is an interface which consist of certain methods
        //The Collection in Java is a framework that provides an architecture to store and manipulate the group of
        // objects.
        //All the operations that you perform on a data such as searching, sorting, insertion, manipulation, deletion,
        // etc. can be achieved by Java Collections.
        //Java Collection means a single unit of objects. Java Collection framework provides
        // many interfaces (Set, List, Queue, Deque, etc.)
        // and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet, etc.).
        Collection<Integer> i = new Collection<Integer>() {

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }
}