package ex_28_Collection_Framework.List;
import java.util.*;
public class Lab176_ArrayList {
    /**
     *  ArrayList  is a resizable array, part of the java.util package, and implements the List interface.
     *  ArrayList is a Java class implemented using the List interface.
     */

    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);

        //Traversing list through Iterator
        Iterator itr=list.iterator();//getting the Iterator
        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }
        System.out.println("-------------------");
        ListIterator<String> litr=list.listIterator();
        while(litr.hasNext())
        {
            String str=litr.next();
            System.out.println(str);
        }
        System.out.println();
        while(litr.hasPrevious())
        {
            String str=litr.previous();
            System.out.println(str);
        }
        System.out.println("-------------------");
        for(String fruit:list) {
            System.out.println(fruit);
        }
        System.out.println("-------------------");
        //accessing the element
        System.out.println("Second element: "+list.get(1));
        System.out.println("First element: "+list.get(0));
        System.out.println("Third element: "+list.get(3));
        System.out.println("Second element: "+list.get(2));
        System.out.println("-------------------");
        //changing the element
        list.set(1,"Guava");
        list.set(2,"Dates");
        System.out.println("-------------------");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("-------------------");
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);

        System.out.println(list2);
        //Sorting the list
        Collections.sort(list2);
        System.out.println(list2);
        System.out.println("-------------------");
        System.out.println(list);
        list.remove(1);
        list.remove("Guava");
        System.out.println("After removing elements: "+list);
        list.clear();
        System.out.println("After clearing elements: "+list);




    }
}