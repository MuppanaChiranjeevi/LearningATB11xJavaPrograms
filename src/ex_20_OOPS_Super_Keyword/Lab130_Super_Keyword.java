package ex_20_OOPS_Super_Keyword;

public class Lab130_Super_Keyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
        dog.work();
    }
}
class Animal{
    String color="white";
    void eat(){
        System.out.println("eating...");
    }
    Animal(){System.out.println("animal constructor");}
}
//Creating child class
class Dog extends Animal{
    String color="black";
    Dog(){
        System.out.println("dog constructor");
    }
    void printColor(){
        System.out.println(super.color);//prints color of Animal class
        System.out.println(color);//prints color of Dog class

    }
    void eat(){
        System.out.println("eating bread...");
    }
    void bark(){
        System.out.println("barking...");
    }
    void work(){
        super.eat();
        eat();
        bark();
    }
}