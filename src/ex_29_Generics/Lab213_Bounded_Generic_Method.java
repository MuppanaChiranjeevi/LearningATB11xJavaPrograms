package ex_29_Generics;

public class Lab213_Bounded_Generic_Method {
    public static<T extends Number> double square(T t){
        return t.doubleValue() * t.doubleValue();
    }
    public static void main(String[] args) {

        System.out.println("Integer Square: "+square(20));
        System.out.println("Float Square: "+square(15.67f));
        System.out.println("Double Square: "+square(11.246));

        // Compilation error
//        System.out.println(square("11.246"));
//        System.out.println(square('K'));
//        System.out.println(square(true));


    }
}
