package ex_28_Collection_Framework.List;

import java.util.*;

public class Lab175_List {


        public static void main(String args[])
        {
            // Creating an object of List interface,
            // implemented by ArrayList class
            List<String> al = new ArrayList<>();

            // Adding elements to object of List interface
            // Custom elements
            al.add("Geeks");
            al.add(1, "For");
            al.addLast("Geeks");
            al.addFirst("Website");

            // Display theinitial elements in List
            System.out.println("Initial ArrayList: " + al);
            System.out.println("Size of ArrayList: " + al.size());

            // Setting (updating) element at 1st index
            // using set() method
            al.set(2, "Chiru");


            System.out.println("First Occurrence of Geeks is at Index: "+al.indexOf("Geeks"));

            System.out.println("Last Occurrence of Geeks is at Index: "+al.lastIndexOf("Geeks"));

            al.remove("Geeks");
            System.out.println("After the Object Removal " + al);

            al.remove(0);
            System.out.println("After the Index Removal " + al);
            al.clear();
            System.out.println("After clearing all: "+al);
            System.out.println("------------------------------");
            al.add("Muppana");
            al.add("Chiranjeevi");
            al.add("Manasa");
            al.add("Manisha");
            System.out.println("List: "+al);
            System.out.println(al.get(0));
            System.out.println(al.get(1));
            System.out.println(al.get(2));
            System.out.println(al.get(3));

            System.out.println("------------------------------");
            System.out.println("Is Manasa present in the list? "+ al.contains("Manasa"));
            System.out.println("Is Chiranjeevi present in the list? "+ al.contains("Chiranjeevi"));
            System.out.println("Is Chinna present in the list? "+ al.contains("Chinna"));
            System.out.println("Is Murali present in the list? "+ al.contains("Murali"));
            System.out.println("------------------------------");
            // Using  for loop for iteration
            for (int i = 0; i < al.size(); i++) {
                System.out.print(al.get(i) + " ");
            }

            System.out.println("\n");

            // Using for-each loop for iteration
            for (String str : al)
                System.out.print(str + " ");
            System.out.println("\n------------------------------");
            Iterator<String> iterator=al.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            System.out.println("------------------------------");
            ListIterator<String> listIterator=al.listIterator();
            while (listIterator.hasNext()){
                System.out.println(listIterator.next());
            }
            System.out.println();

            while (listIterator.hasPrevious()){
                System.out.println(listIterator.previous());
            }


        }
    }

