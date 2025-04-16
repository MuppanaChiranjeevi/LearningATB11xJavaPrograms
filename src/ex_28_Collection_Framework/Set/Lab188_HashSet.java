package ex_28_Collection_Framework.Set;

import java.util.*;

public class Lab188_HashSet {
    /**
     * HashSet in Java implements the Set interface of Collections Framework.
     * It is used to store the unique elements.
     * HashSet doesn't maintain the insertion order.
     * HashSet allows only one null value.
     * HashSet stores the elements by using a mechanism called hashing.
     * HashSet is not thread-safe.
     */
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println(set);
        System.out.println(set.size());
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
