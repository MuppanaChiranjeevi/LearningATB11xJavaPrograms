package ex_23_Static_Keyword;

public class Lab142_Static_Keyword {
    public static void main(String args[]){
        Student s1 = new Student(111,"Karan");
        s1.nonStaticdisplay();
        Student s2 = new Student(222,"Aryan");
        Student.college="BBDIT";
        s2.nonStaticdisplay();
    }
}
//Java Program to demonstrate the use of static variable
class Student{
    int rollno; //instance variable
    String name;
    static String college;//static variable (common property)
    static {
        college="IIT";
        System.out.println("static block invoked, college initialized to: "+ college);
//        rollno=100; // Non-static members cannot be referenced from a static context
    }

    //constructor
    Student(int r, String n){
        System.out.println("Constructor invoked");
        rollno = r;
        name = n;
    }
    //method to display the values
    void nonStaticdisplay (){
        System.out.println(rollno+" "+name+" "+college);
    }
}
