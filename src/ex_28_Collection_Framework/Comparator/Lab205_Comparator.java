package ex_28_Collection_Framework.Comparator;
import java.util.*;

public class Lab205_Comparator {
    /**
     * The Comparator interface in Java is used to define custom sorting logic for objects.
     * The Comparator interface is present in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).
     * public int compare(Object obj1, Object obj2) --> It compares the first object with the second object.
     * Returns a negative number if obj1 < obj2
     * Returns 0 if obj1 == obj2
     * Returns a positive number if obj1 > obj2
     *
     * public boolean equals(Object obj) --> It is used to compare the current object with the specified object.
     *
     * The comparator interface is useful when,
     * We need multiple sorting strategies for a class.
     * When we want to keep the sorting logic separate from the class.
     */
    public static void main(String[] args) {
        List<Student1> studlist= Arrays.asList(new Student1(101,"chiru",25,95.78),
                new Student1(103,"manasa",21,91.46),new Student1(102,"Dipak",27,89.29),
                new Student1(100,"Mouli",22,93.17));
        System.out.println("Given ArrayList");
        for(int i=0;i<studlist.size();i++){
            System.out.println(studlist.get(i));
        }
        System.out.println("Sorting by Name");
        Collections.sort(studlist,new NameComparator());
        studlist.forEach(System.out::println);
        System.out.println("----------------------");
        System.out.println("Sorting by age (Ascending)");
        Collections.sort(studlist,new AgeComparator());
        for(Student1 stud:studlist){
            System.out.println(stud);
        }
        System.out.println("----------------------");;
        System.out.println("Sorting by RollNo (Descending)");
        Collections.sort(studlist,new RollNoComparator());
        Iterator<Student1> itr=studlist.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------------");;
        System.out.println("Sorting by Percentage (Ascending)");
        Collections.sort(studlist,new PercentageComparator());
        ListIterator<Student1> litr=studlist.listIterator();
        while (litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Sorting by Percentage (Descending)");
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        System.out.println("Sorting by Age then by Percentage");
        studlist.sort(Comparator
                .comparingInt((Student1 s) -> s.getAge())
                .thenComparingDouble(s -> s.getPercentage()));

        studlist.forEach(System.out::println);

    }
}


class Student1 {
    private int rollNo;
    private String name;
    private int age;
    private double percentage;

    public Student1(int rollNo, String name, int age, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.percentage=percentage;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", percentage=" + percentage +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getPercentage() {
        return percentage;
    }
}

class NameComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }

}

class AgeComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getAge()-o2.getAge();
    }
}
class RollNoComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o2.getRollNo() - o1.getRollNo();
    }
}

    class PercentageComparator implements Comparator<Student1>{

        @Override
        public int compare(Student1 o1, Student1 o2) {
            return Double.compare(o1.getPercentage(),o2.getPercentage());
        }
}
