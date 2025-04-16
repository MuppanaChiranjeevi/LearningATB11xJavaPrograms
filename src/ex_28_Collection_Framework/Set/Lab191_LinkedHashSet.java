package ex_28_Collection_Framework.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Lab191_LinkedHashSet {
    /**
     * LinkedHashSet in Java implements the Set interface of the Collection Framework.
     * LinkedHashSet combines the features of a HashSet with a linked list to maintain insertion order.
     * Key Features:
     *      No duplicates – Just like any Set, it won't allow duplicate elements.
     *      Insertion Order: Maintains the order in which elements were inserted
     *      Null Elements: Allows one null element
     *      Not Thread-Safe: Like HashSet, it's not thread-safe by default
     *
     * How It Works
     * LinkedHashSet extends HashSet and implements the Set interface. Internally, it:
         * 💡 Backed by a hash table + doubly linked list.
         * Uses a hash table for storage (like HashSet)
         * Maintains a doubly-linked list running through all entries to maintain insertion order
     *
     */
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Add elements (maintains insertion order)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate - won't be added
        fruits.add("Orange");

        System.out.println(fruits);
        System.out.println(fruits.size());

        // Check if element exists
        System.out.println("hasBanana: " + fruits.contains("Banana"));

        // Iterate (order is maintained)
        for (String fruit : fruits) {
            System.out.print(fruit+" ,");
        }
        System.out.println("\n----------");
        Iterator itr=fruits.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("------------------");
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.contains("Grapes"));
        System.out.println(fruits.isEmpty());
        System.out.println("------------------");
        // Remove element
        System.out.println(fruits.remove("Orange")); // // Removing the element from above Set and returns true
        System.out.println(fruits);
        System.out.println(fruits.size());
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println(fruits);
        System.out.println(fruits.size());
        fruits.clear();
        System.out.println(fruits);
        System.out.println(fruits.size());
    }
}
