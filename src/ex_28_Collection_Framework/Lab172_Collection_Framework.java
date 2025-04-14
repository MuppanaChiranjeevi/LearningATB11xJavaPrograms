package ex_28_Collection_Framework;
import java.util.*;
public class Lab172_Collection_Framework {

    public static void main(String[] args) {

        // create an empty ArrayList with an initial capacity
        Collection<Integer> list = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        list.add(15);
        list.add(20);
        list.add(25);

        // prints all the elements available in list
        for (Integer i : list) {
            System.out.println("Number = " + i);
        }
        System.out.println("ArrayList is: "+list);

        // Creating another empty ArrayList
        Collection<Integer> list2 = new ArrayList<Integer>();

        // Appending the collection to the list
        list2.addAll(list);

        // displaying the modified ArrayList
        System.out.println("The new ArrayList is: " + list2);
    }
}
