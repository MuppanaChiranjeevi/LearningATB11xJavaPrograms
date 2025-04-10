package ex_19_OOPS_Access_Modifiers.package2;

import ex_19_OOPS_Access_Modifiers.package1.Parent;

public class Child extends Parent {
    public void accessFromChild() {
        System.out.println("Accessing from Child (subclass in different package):");

        protectedMethod();  // ✅ Allowed — because it's a subclass

        // defaultMethod(); // ❌ Not allowed — default is package-private
    }
}
