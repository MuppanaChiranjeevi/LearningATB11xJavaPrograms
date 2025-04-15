package ex_28_Collection_Framework.List;
import java.util.*;
public class Lab178_ArrayList_Example {
    public static void main(String args[]){
        //Creating user-defined class objects
        Student s1=new Student(101,"Sonoo",23);
        Student s2=new Student(102,"Ravi",21);
        Student s3=new Student(103,"Hanumath",25);
        //creating arraylist
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Student st= (Student) itr.next();
            System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
        }
        System.out.println(al);
    }
}
class Student{
    private int rollno;
    private String name;
    private int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

