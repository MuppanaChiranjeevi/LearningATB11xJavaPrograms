package ex_28_Collection_Framework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lab182_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println("Size: "+list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("----------------------");
        for (Integer i:list){
            System.out.println(i);
        }
        System.out.println("----------------------");
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------------");
        Iterator i=list.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("----------------------");
        ListIterator litr=list.listIterator();
        while (litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println();
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        System.out.println("----------------------");
        System.out.println("LinkedList: "+ list);
        Object[] a = list.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for(Object element : a)
            System.out.print(element+" ");

    }
}
