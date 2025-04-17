package ex_28_Collection_Framework.Queque;

import java.util.*;

public class Lab198_Deque {
    /**
     * Deque stands for Double Ended Queue.
     * It is a linear data structure that allows insertion and deletion of elements from both ends (front and rear).
     * Deque can be used as a stack (LIFO) or a queue (FIFO).
     *
     * ArrayDeque is a resizable-array implementation of the Deque interface.
     * Faster than LinkedList for stack and queue operations.
     * No capacity restrictions (it grows as needed).
     * Not thread-safe (no synchronization).
     */
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        // Add elements to the front (head)
        deque.addFirst("First");
        deque.offerFirst("Very First");

        deque.add("Second");
        deque.add("Third");

        // Add elements to the end (tail)
        deque.addLast("Last");
        deque.offerLast("Very Last");

        System.out.println("Deque: " + deque);

        // Access elements
        System.out.println("First element: " + deque.getFirst()); // Very First
        System.out.println("Last element: " + deque.getLast());

        // Remove elements from front
        System.out.println("Removed from front: " + deque.removeFirst()); // Very First
        System.out.println("Removed from front (poll): " + deque.pollFirst()); // First

        // Remove elements from end
        System.out.println("Removed from end: " + deque.removeLast()); // Very Last
        System.out.println("Removed from end (poll): " + deque.pollLast()); // Last

        System.out.println("Deque after removals: " + deque); // []
        System.out.println("----------------------------");
        System.out.println("Peek: " + deque.peek());
        System.out.println("Deque after peek: " + deque);
        System.out.println("Element: " + deque.element());
        System.out.println("Deque after Element: " + deque);
        System.out.println("Poll: " + deque.poll());
        System.out.println("Deque after Poll: " + deque);
        System.out.println("Remove: " + deque.remove());
        System.out.println("Deque after Poll: " + deque);
        System.out.println("----------------------------");


        // Using as a stack
        deque.push("Stack Element 1"); // same as addFirst
        deque.push("Stack Element 2");
        System.out.println("Top of stack: " + deque.peek()); // Stack Element 2
        System.out.println("Popped: " + deque.pop()); // Stack Element 2

        // Using as a queue
        deque.offer("Queue Element 1"); // same as addLast
        deque.offer("Queue Element 2");
        System.out.println("Head of queue: " + deque.peek());
        System.out.println("Removed: " + deque.poll());


    }
}
