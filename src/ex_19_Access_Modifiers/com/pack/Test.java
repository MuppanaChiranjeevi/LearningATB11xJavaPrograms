package ex_19_Access_Modifiers.com.pack;

public class Test {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
        System.out.println(obj.num);
        obj.num = 100;
        System.out.println(obj.num);

        System.out.println("-----------------------");
        // Private members
//        System.out.println(obj.data);//Compile Time Error
//        obj.show();//Compile Time Error

        // Private constructor
//        A a = new A(100,200);

        System.out.println("-----------------------");
        B b = new B();
        b.display();
        System.out.println(b.z);
        System.out.println("-----------------------");
        C c =new C();
        c.details();
        System.out.println(c.name);
    }
}
