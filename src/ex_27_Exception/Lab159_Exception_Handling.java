package ex_27_Exception;

public class Lab159_Exception_Handling {
    public static void main(String args[]){
        try{
            //code that may raise exception
            int data=100/0;
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed!");
            System.out.println(e);
            System.out.println(e.getMessage());}
        //rest code of the program
        System.out.println("rest of the code...");
        System.out.println("execution continues from the code placed after the try-catch block.");

    }
}