package ex_28_Collection_Framework.List;

import java.util.*;

public class Lab174_List {

    public static void main(String[] args)
    {

        // Creating a List of Strings using ArrayList
        List<String> li = new ArrayList<>();

        // Adding elements in List
        li.add("Java");
        li.add("Python");
        li.add("DSA");
        li.add("C++");

        System.out.println("Elements of List are:");
        // Iterating through the list
        for (String s : li) {
            System.out.println(s);
        }
        System.out.println("ArrayList: "+li);
        System.out.println("-------------------------------");
        // Accessing elements
        System.out.println("Element at Index 0: "+ li.get(0));
        System.out.println("Element at Index 2: "+ li.get(2));
        System.out.println("Element at Index 3: "+ li.get(3));
        System.out.println("Element at Index 1: "+ li.get(1));
        System.out.println("-------------------------------");
        // Updating elements
        li.set(1, "JavaScript");
        System.out.println("Updated List: " + li);
        li.set(2, "Ruby");
        System.out.println("Updated List: " + li);
        System.out.println("-------------------------------");
        // inserting elements
        li.add(3,"GO");
        System.out.println("List After inserting Element: " + li);
        li.add(0,"Python");
        System.out.println("List After inserting Element: " + li);
        System.out.println("-------------------------------");
        // Removing elements
        li.remove("C++");
        System.out.println("List After Removing Element: " + li);
        li.remove("Ruby");
        System.out.println("List After Removing Element: " + li);
        li.remove(2);
        System.out.println("List After Removing Element: " + li);
        li.remove(1);
        System.out.println("List After Removing Element: " + li);

    }
}
