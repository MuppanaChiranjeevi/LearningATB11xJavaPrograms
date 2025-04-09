package ex_19_Access_Modifiers.com.example;


public class MyClass {
    public int x; // Can be accessed anywhere

    public void show() {
        System.out.println("This is a public method.");
    }
    private int y; // Private field, can only be accessed within this class

    private void setY(int value) { // Private method
        y = value;
    }

}

