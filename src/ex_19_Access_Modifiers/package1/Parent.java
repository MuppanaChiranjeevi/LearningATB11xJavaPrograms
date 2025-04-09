package ex_19_Access_Modifiers.package1;


public class Parent {
    protected void protectedMethod() {
        System.out.println("Protected method in Parent");
    }

    void defaultMethod() {
        System.out.println("Default (package-private) method in Parent");
    }
}
