package ex_29_Generics;

interface GenericInterface<T>{
    public void display(T[] array);
}

class IntArrPrinter implements GenericInterface<Integer>{

    @Override
    public void display(Integer[] array) {
        for(Integer i:array){
            System.out.print(i+" ");
        }
        System.out.println("\n---------------");
    }
}
class StrArrPrinter implements GenericInterface<String>{

    @Override
    public void display(String[] array) {
        for(String s:array){
            System.out.print(s+" ");
        }
        System.out.println("\n---------------");
    }
}
class DouleArrPrinter implements GenericInterface<Double>{

    @Override
    public void display(Double[] array) {
        for(Double d:array){
            System.out.print(d+" ");
        }
        System.out.println("\n---------------");
    }
}
class GenericPrinter<G> implements GenericInterface<G>{

    @Override
    public void display(G[] array) {
        for(G obj:array){
            System.out.print(obj+"  ");
        }
        System.out.println("\n---------------");
    }

}



public class Lab214_Generic_Interface {
    public static void main(String[] args) {
        GenericInterface<Integer> intArrPrinter=new IntArrPrinter();
        intArrPrinter.display(new Integer[]{12,23,34,45,56,67});
        GenericInterface<String>  strArrPrinter=new StrArrPrinter();
        strArrPrinter.display(new String[]{"hp","lenovo","apple","acer"});
        GenericInterface<Double>  douleArrPrinter=new DouleArrPrinter();
        douleArrPrinter.display(new Double[]{123.456,456.789,654.987,321.678});

        GenericInterface<Character> charPrinter=new GenericPrinter<>();
        charPrinter.display(new Character[]{'C','H','I','R','U'});
        GenericInterface<Boolean> boolPrinter=new GenericPrinter<>();
        boolPrinter.display(new Boolean[]{true,false,false,true,false,true,true});
        GenericInterface<Float> floatPrinter=new GenericPrinter<>();
        floatPrinter.display(new Float[]{67.874f,982.763f,562.982f,92.63f,654.321f});

    }

}
