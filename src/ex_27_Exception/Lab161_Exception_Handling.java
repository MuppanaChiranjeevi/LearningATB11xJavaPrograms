package ex_27_Exception;

public class Lab161_Exception_Handling {

    public static void main(String[] args) {
        try {
            // ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[2]);
            // ArithmeticException
            int result = 10 / 1;
            System.out.println(result);
            // NullPointerException
            String s = "null";
            System.out.println(s.length());
            // General Exception
            int[] arr=new int[-1];
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General/Parent Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after the try-catch block.");
    }
}
