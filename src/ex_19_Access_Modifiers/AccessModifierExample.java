package ex_19_Access_Modifiers;

public class AccessModifierExample {

// Class with members having all access modifiers
    public String publicVar = "I am Public";
    protected String protectedVar = "I am Protected";
    String defaultVar = "I am Default (Package-Private)";
    private String privateVar = "I am Private";

    public void publicMethod() {
        System.out.println("Public Method: " + publicVar);
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: " + protectedVar);
    }

    void defaultMethod() {
        System.out.println("Default Method: " + defaultVar);
    }

    private void privateMethod() {
        System.out.println("Private Method: " + privateVar);
    }

    public void accessPrivateInsideClass() {
        // Private members accessible inside the same class
        System.out.println("Accessing private method/var inside same class:");
        System.out.println("Private Variable: " + privateVar);
        privateMethod();
    }
}