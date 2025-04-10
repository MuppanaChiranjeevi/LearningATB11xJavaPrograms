package ex_19_OOPS_Access_Modifiers;

public class Lab128_Access_Modifiers_Example {
    public static void main(String[] args) {
        AccessModifierExample obj = new AccessModifierExample();

        // Accessing all members from another class in the same package
        System.out.println("From another class in the same package:");
        System.out.println("Public Var: " + obj.publicVar);
        System.out.println("Protected Var: " + obj.protectedVar);
        System.out.println("Default Var: " + obj.defaultVar);
        // System.out.println("Private Var: " + obj.privateVar); // ❌ Not allowed

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        // obj.privateMethod(); // ❌ Not allowed

        obj.accessPrivateInsideClass(); // ✅ Accessing private from within its class
    }
}


