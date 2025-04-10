package ex_22_OOPS_Interfaces;

public class Lab137_Interfaces {
    public static void main(String args[]){
        Drawable drawable;
        drawable=new Circle();
        drawable.draw();
        drawable = new Rectangle();
        drawable.draw();
    }
}
//Creating an interface
interface Drawable{
    void draw();
}
//Implementation of Interface
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}
