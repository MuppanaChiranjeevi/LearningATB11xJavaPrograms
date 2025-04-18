package ex_29_Generics;


class Test<T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U

    // constructor
    Test(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print()
    {

        System.out.println(obj1+" "+obj2);
    }
}

// Driver class to test above
public class Lab215_GenericClass_Parameters {

    public static void main (String[] args)
    {
        Test <String, Integer> obj = new Test<String, Integer>("GfG", 15);
        Test <Double, Character> obj1 = new Test<>(7643.9872, 'D');
        Test <Float, Boolean> obj2 = new Test(654.21f, false);

        obj.print();
        obj1.print();
        obj2.print();
    }
}
