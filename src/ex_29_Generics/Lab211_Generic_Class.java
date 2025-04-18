package ex_29_Generics;

//class Chiru<T extends Number>{  // Bounded Type Parameters
class Chiru<T>{
    private T value;

    public Chiru(T value){
        this.value=value;
    }
    public T get(){
        return value;
    }
    public void set(T value){
        this.value=value;
    }


}

public class Lab211_Generic_Class{
    public static void main(String[] args) {

        // Using String
        Chiru<String> c1=new Chiru<>("Muppana");
        System.out.println("String Value: "+c1.get());
        c1.set("Chiranjeevi");
        System.out.println("Updated String Value: "+c1.get());

        System.out.println("---------------------");

        // Using Integer
        Chiru<Integer> c2=new Chiru<>(830966231);
        System.out.println("Integer Value: "+c2.get());
        c2.set(99080323);
        System.out.println("Updated Integer Value: "+c2.get());

        System.out.println("---------------------");

        // Using Character
        Chiru<Character> c3=new Chiru<>('M');
        System.out.println("Character Value: "+c3.get());

        // Using Boolean
        Chiru<Boolean> c4=new Chiru<>(false);
        System.out.println("Boolean Value: "+c4.get());

        System.out.println("---------------------");

        // Using Double
        Chiru<Double> c5=new Chiru<>(764.423);
        System.out.println("Double Value: "+c5.get());
        c5.set(1234.5678);
        System.out.println("Updated Double Value: "+c5.get());


    }
}
