package ex_19_OOPS_Access_Modifiers.package2;

public class Lab127_Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.accessFromChild();

        System.out.println("-----------------");

        NonChild nc = new NonChild();
        nc.accessFromNonChild();
    }
}