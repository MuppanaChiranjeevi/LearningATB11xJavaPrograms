package ex_28_Collection_Framework.Comparable;
import java.util.*;
public class Lab203_Comparable {
    /**
     * The Comparable interface in Java is used to define the natural ordering of objects of a class.
     * This interface is a part of the java.lang package and contains only one method named compareTo(Object).
     * public int compareTo(Object obj): used to compare the current object with the specified object. It returns
     * positive integer, if the current object is greater than the specified object.
     * negative integer, if the current object is less than the specified object.
     * zero, if the current object is equal to the specified object.
     *
     * Note: String class and Wrapper classes implement the Comparable interface by default.
     *       So if you store the objects of string or wrapper classes in a list, set or map,
     *       it will be Comparable by default.
     * Used by: Collections.sort(), Arrays.sort(), TreeSet, TreeMap, etc.
     */
    public static void main(String[] args) {
        // Create a list of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Diana", 105, 3.8));
        students.add(new Student("Ethan", 102, 3.5));
        students.add(new Student("Charlie", 101, 3.9));
        students.add(new Student("Alice", 104, 3.7));
        students.add(new Student("Bob", 103, 3.6));

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort using Collections.sort() which relies on Comparable implementation
        Collections.sort(students);

        System.out.println("\nAfter sorting by roll number (natural ordering):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}


// Student class implementing Comparable interface
class Student implements Comparable<Student> {
    private String name;
    private int rollNumber;
    private double gpa;

    public Student(String name, int rollNumber, double gpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
    }

    // Implementing compareTo method to define natural ordering
    @Override
    public int compareTo(Student s) {
        // Compare based on roll number
//        return this.rollNumber - s.rollNumber;
        // Compare based on name
//        return this.name.compareTo(s.name);

        // Compare based on GPA
        return Double.compare(this.gpa,s.gpa);

    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + ", gpa=" + gpa + "}";
    }
}

