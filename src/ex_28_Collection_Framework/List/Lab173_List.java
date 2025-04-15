package ex_28_Collection_Framework.List;
import java.util.*;
public class Lab173_List {
    /**
     * The List interface in Java is part of the Java Collections Framework (JCF) and represents an ordered collection (sequence) of elements.
     * It allows duplicate values and maintains insertion order, meaning elements are stored in the order they are added.
     * Key Features of List Interface
         * Order is maintained – elements are stored in the order they are added.
         * Allows Duplicates – The same element can be added multiple times.
         * Positional access – you can get, insert, or remove elements using index.
         * Dynamic Sizing – Unlike arrays, Lists can grow or shrink in size.
     *  Collection --> List;
     *  List --> ArrayList;
     *  List --> LinkedList;
     *  List --> Vector;
     *  Vector --> Stack;
     * The implementation classes of the List interface are ArrayList, LinkedList, Stack, and Vector.
     * ArrayList – Resizable array (better for storing and accessing data.).
     * LinkedList – Doubly-linked list (fast insertions/deletions --> better for manipulating data.).
     * Vector – Thread-safe but slower (legacy).
     * Stack – LIFO (Last-In-First-Out) structure.
     *
     * Syntax of List Interface
     * List<Obj> list = new ArrayList<Obj> ();
     * Obj is the type of the object to be stored in List.
     *
     * To instantiate the List interface, we must use:
     * List <data-type> list1= new ArrayList();
     * List <data-type> list2 = new LinkedList();
     * List <data-type> list3 = new Vector();
     * List <data-type> list4 = new Stack();
     * data-type is the type of the object to be stored in List.
     */
        public static void main(String[] args) {
//            List mixedList = new ArrayList();
            List<Object> mixedList = new ArrayList<>();

            mixedList.add("Hello");         // String
            mixedList.add(42);              // Integer (autoboxed to Integer object)
            mixedList.add(3.14);            // Double
            mixedList.add(6.789f);          // float
            mixedList.add(true);            // Boolean
            mixedList.add('A');             // Character

            // Loop and print
            for (Object item : mixedList) {
                System.out.println(item);
                System.out.println(item.getClass());
                System.out.println(item.getClass().getSimpleName());
            }
        }
    }


