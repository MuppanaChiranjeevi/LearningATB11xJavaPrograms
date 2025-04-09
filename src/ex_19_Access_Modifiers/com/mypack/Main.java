package ex_19_Access_Modifiers.com.mypack;

import ex_19_Access_Modifiers.com.pack.A;
import ex_19_Access_Modifiers.com.pack.*;
public class Main extends C {
    public static void main (String args[]) {
        A obj = new A();
        obj.msg();
        System.out.println(obj.num);
        obj.num = 100;
        System.out.println(obj.num);

        System.out.println("-------------------");

        // Private members
//        System.out.println(obj.data);//Compile Time Error
//        obj.show();//Compile Time Error

        // Private constructor
//        A a = new A(100,200);


        // The default modifier is accessible within a package only.
//        B b = new B();          //Compile Time Error
//        b.display();            //Compile Time Error
//        System.out.println(b.z); //Compile Time Error

        Main m = new Main();
        m.details();
        System.out.println(m.name);
        // Accessing protected members directly in the subclass
        C c = new C(); // You cannot access protected members from this instance
//        c.details();  // ERROR: deatils() has protected access in C
//        System.out.println(c.name); // ERROR: name has protected access in C

    }
}