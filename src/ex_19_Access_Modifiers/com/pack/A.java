package ex_19_Access_Modifiers.com.pack;


public class A {
    public int num =50;
    public void msg() { System.out.println("Hello, This is public method"); }
    private int data=40;
    private void show(){System.out.println("Hello, This is private method");}

    public A(){}

    //private constructor
    // If you make any class constructor private, you cannot create an instance of that class from outside the class using that constructor
    private A(int num,int data){
        this.num=num;
        this.data=data;
    }


}