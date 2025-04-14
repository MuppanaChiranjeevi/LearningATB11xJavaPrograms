package ex_28_Collection_Framework;
import java.util.*;
public class LaB171_Collection_Framework {
    /**
     * The Collections in Java is a framework that provides an architecture to store and manipulate the group of objects.
     * Any group of individual objects that are represented as a single unit is known as a Java Collection.
     * The Java Collections Framework (JCF) provides a set of interfaces, classes, and algorithms
     * to store, retrieve, and manipulate these groups of objects efficiently.
     * Collection =  Collection represents a single group of individual objects treated as one unit.
     * JCF = Interfaces + Classes + Algorithms to manage collections.
     * The Java Collections Framework (JCF) is part of the java.util package
     * 1. Core Interfaces
     * Collection – Root interface for all collections (except Map).
         * List – Ordered collection (allows duplicates).
         *        Implementations: ArrayList, LinkedList, Vector, Stack.
         * Set – Unordered collection (no duplicates).
                 Implementations: HashSet, LinkedHashSet, TreeSet.
         * Queue – FIFO (First-In-First-Out) structure.
                   Implementations: LinkedList, PriorityQueue, ArrayDeque.
     *
     * Map (Not part of Collection, but part of JCF) – Stores key-value pairs.
               Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable.
     * The Object class is the parent class of all the classes in java by default.
     * Iterable Interface
     * The Iterable interface is the root interface for all the collection classes.
     * The Collection interface extends the Iterable interface and therefore all the subclasses
     * of Collection interface also implement the Iterable interface.
     * It contains only one abstract method. i.e.,
     * Iterator<T> iterator() // returns the iterator over the elements of type T.
     *
     * Collection Framework contains both classes and interfaces.
     * Although both seem the same but there are certain differences between Collection classes and the Collections framework.
     * Collection is a interface present in java.util package.
     * Collections is a utility class present in java.util package.
     * Remember: Object is the parent class of all the classes.
     *
     *
     */

    public static void main(String[] args) {

        // Create a Collection using ArrayList
        Collection c = new ArrayList();

        // Adding elements to the collection
        c.add("Apple");
        c.add(1);
        c.add(true);
        c.add(123.456);
        c.add('M');

        System.out.println("Collection: " + c);

    }
}
