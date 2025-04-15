package ex_28_Collection_Framework.List;

import java.util.*;

public class Lab179_LinkedList {
    /**
     * LinkedList is a class that implements the List interface and represents a  linear data
     * structure where elements (nodes) are stored in non-contiguous memory locations.
     * A LinkedList uses a doubly-linked list structure where each element (called a node) contains:
         * The actual data
         * A reference to the next node
         * A reference to the previous node
     * LinkedList is a part of the java.util package and implements List, Deque, Queue.
     * Elements can't be accessed directly by index - traversal is required.
     * Faster insertions/deletions than ArrayList (especially in the middle of the list)
     * Slower access compared to ArrayList (because you can't just index it directly)
     * ✅ Key Features
     * Can contain duplicate elements
     * Maintains insertion order
     * Allows null elements
     * Methods: > javap java.util.LinkedList
     *   public java.util.LinkedList();
     *   public java.util.LinkedList(java.util.Collection<? extends E>);
     *   public E getFirst();
     *   public E getLast();
     *   public E removeFirst();
     *   public E removeLast();
     *   public void addFirst(E);
     *   public void addLast(E);
     *   public boolean contains(java.lang.Object);
     *   public int size();
     *   public boolean add(E);
     *   public boolean remove(java.lang.Object);
     *   public boolean addAll(java.util.Collection<? extends E>);
     *   public boolean addAll(int, java.util.Collection<? extends E>);
     *   public void clear();
     *   public E get(int);
     *   public E set(int, E);
     *   public void add(int, E);
     *   public E remove(int);
     *   public int indexOf(java.lang.Object);
     *   public int lastIndexOf(java.lang.Object);;
     *   public E remove();
     */
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> l = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        l.add("Two");
        l.add("Four");
        l.addFirst("One");
        l.addLast("Five");
        l.add(2,"Three");
        // Printing the LinkedList
        System.out.println(l);
        ArrayList<String> al=new ArrayList<>();

        al.add("Eight");
        al.addFirst("Six");
        al.add(1,"Seven");
        al.addLast("Nine");
        System.out.println(al);

        l.addAll(al);
        System.out.println(l);


        Iterator<String> itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
