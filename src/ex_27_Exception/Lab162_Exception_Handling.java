package ex_27_Exception;

public class Lab162_Exception_Handling {
    public static void main(String[] args) {
        try {
            // Uncomment any one block at a time to see different exceptions

            // ArithmeticException
//             int result = 10 / 0;

            // ArrayIndexOutOfBoundsException
//             int[] arr = {1, 2, 3};
//             System.out.println(arr[5]);

            // NullPointerException
//             String str = null;
//             System.out.println(str.length());

            // NumberFormatException
//             String num = "abc";
//             int parsed = Integer.parseInt(num);

            // StringIndexOutOfBoundsException
//             String text = "Java";
//             System.out.println(text.charAt(10));
            // ClassCastException
            Object obj = "hello";
            Integer num = (Integer) obj;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException |
                 NullPointerException | NumberFormatException |
                 StringIndexOutOfBoundsException | ClassCastException e) {
            System.out.println("Caught an exception: " + e);
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}
