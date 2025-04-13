package ex_27_Exception;

public class Lab158_Exception_Handling {
        public static void main(String[] args) {
            try {
                int data = 10 / 0;  // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            } finally {
                System.out.println("I will always execute weather an Exception occur or not");
            }
            System.out.println("---------------");
            System.out.println(testMethod());
            //  Even though we used return, the finally block still ran.
        }

    public static String testMethod() {
        try {
            return "From try";
        } catch (Exception e) {
            return "From catch";
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
