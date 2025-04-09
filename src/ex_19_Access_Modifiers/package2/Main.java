package ex_19_Access_Modifiers.package2;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.accessFromChild();

        System.out.println("-----------------");

        NonChild nc = new NonChild();
        nc.accessFromNonChild();
    }
}