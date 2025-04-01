package ex_14_OOPS_Class_Object;
class Student{
    String name;
    int id;
    int age;
    boolean isPresent;

    void display() {
        System.out.println("Name: "+name+"\nid: "+id+"\nage: "+age+"\nisPrsent: "+isPresent);
    }
    void changeIsPresent(boolean currentStatus) {
        isPresent=currentStatus;
    }
    static void methodStatic() {
        System.out.println("I am a static method ");
    }
}
public class Lab088_Main {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Chiranjeevi";
        student1.id = 12345;
        student1.age =26;
        student1.isPresent = true;
        student1.display();
        System.out.println("------------------------");
        Student student2=new Student();
        student2.name="Manasa";
        student2.id = 67890;
        student2.age =22;
        student2.isPresent = false;
        student2.display();
        System.out.println("------------------------");
        student2.changeIsPresent(true);
        student2.display();
        System.out.println("------------------------");
        Student.methodStatic();
    }


}
