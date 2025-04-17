package ex_28_Collection_Framework.Queque;

import java.util.*;

public class Lab196_Queque {
    /**
     * The Queue interface in Java is part of the Java Collections Framework, and
     * it represents a collection designed for holding elements prior to processing.
     * It follows the FIFO (First-In-First-Out).
     * Key Features:
     * Ordered collection that supports insertion at one end (rear/tail) and removal from the other end (front/head).
     * Usually FIFO: The element added first is removed first.
     * LinkedList, PriorityQueue, ArrayDeque, ConcurrentLinkedQueue are the Common Implementations
     * Duplicate and null values are allowed
     *
     *
        Method	                Description
     boolean add(E e)	Inserts element, throws exception if it fails
     boolean offer(E e)	Inserts element, returns false if it fails
     E remove()	        Retrieves and removes head, throws exception if empty
     E poll()	        Retrieves and removes head, returns null if empty
     E element()	    Retrieves head without removing, throws exception if empty
     E peek()	        Retrieves head without removing, returns null if empty
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.offer("Banana");
        queue.add("Cherry");
        System.out.println(queue.offer("Apple"));
        System.out.println(queue.add("Banana"));
        queue.offer(null);
        queue.offer(null);
        System.out.println(queue);
        System.out.println(queue.size());

        System.out.println("Removed element: " + queue.remove());

        // print the updated queue
        System.out.println("Queue after removal: " + queue);


        // pol at the element at the front of the queue
        String pooled = queue.poll();
        System.out.println("Pooled element: " + pooled);

        // print the updated queue
        System.out.println("Queue after pool: " + queue);

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // print the updated queue
        System.out.println("Queue after peek: " + queue);

        String element = queue.element();
        System.out.println("element: " + element);

        // print the updated queue
        System.out.println("Queue after element: " + queue);
    }
}
