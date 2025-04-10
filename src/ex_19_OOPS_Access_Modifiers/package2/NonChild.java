package ex_19_OOPS_Access_Modifiers.package2;

import ex_19_OOPS_Access_Modifiers.package1.Parent;

public class NonChild {
    public void accessFromNonChild() {
        Parent p = new Parent();
        System.out.println("Accessing from NonChild (not a subclass, different package):");

        // p.protectedMethod(); // ❌ Not allowed — only accessible to subclasses
        // p.defaultMethod();   // ❌ Not allowed — package-private
    }
}
