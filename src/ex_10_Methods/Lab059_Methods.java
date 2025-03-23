package ex_10_Methods;

public class Lab059_Methods {
        /**
         * What is a Java Method?
         *  In Java, a method is a block of code that performs a specific task.
         *  A method is a collection of statements that grouped together to perform a certain task or operation.
         *  We write a method once and use it many times.
         *  Method can be called multiple times from various parts of the program.
         *  Method is always defined within a class.
         *  All methods in Java must belong to a class
         *  Methods help in organizing code, making it reusable, and improving readability.
         *
         *  Syntax of a Java Method:
         *  access_modifier return_type method_name(parameter_list)
         *  {
         *     // Method body (code to be executed)
         *     return value; // Optional (only if return_type is not void)
         *  }
         *
         * Components of a Method:
         * Access Modifier: Defines the access level of the method.
         *        public: Accessible from anywhere.
         *        private: Accessible only within the class.
         *        protected: Accessible within the package and subclasses.
         *        Default (no modifier): Accessible only within the package.
         *
         * Return Type: Data type of value the method returns.
         *      Use void if the method does not return any value.
         *      Use int, String, double, etc., if the method returns a value.
         *
         * Method Name: The name of the method (should follow Java naming conventions -> use camelCase).
         *
         * Parameter List: A list of input values that method accepts.
         *                 A list of input parameters separated by a comma and enclosed within the pair of parentheses.
         *                 It is optional. Empty parentheses are used if no parameters are needed.
         *
         * Method Body: The block of code that contains the logic of the method.
         *              It is enclosed within the pair of curly braces.
         *
         * Note: - Method Signature consists of the method name and a parameter list.
         *
         * Types of Methods
         * 1.Predefined Methods:
         * Methods that are already defined in Java class libraries.
         * It is also known as the built-in method.
         * Example: System.out.println(), Math.sqrt(),Math.max(), Math.PI() etc..,
         *
         * 2.User-Defined Methods:
         * Methods that are created by the programmer to perform specific tasks.
         *
         *----------------------------------------------------------------------------
         * Static Method: A method that belongs to the class rather than an instance(object) of the class.
         *                Static Method can be called/invoked without creating an object of the class.
         *                Static Method is invoked by using the class name.
         */
        public static void main(String[] args) {
            // Calling the method
            show();
            printMessage();
            square(6);
            // Calling the method and storing the result
            System.out.println(greetMessage());
            int result = addNumbers(15, 10);
            System.out.println("The sum is: " + result);

    }
    static void show()
    {
        System.out.println("It is an example of static method.");
    }
    // Method with no return type and no parameters
    public static void printMessage() {
        System.out.println("Hello, World!");
    }

    // Method with no return type and one parameter
    public static void square(int a) {
        System.out.println("The square of "+a+" is "+(a * a));
    }

    // Method with  return type 'String' and no parameters
    public static String greetMessage() {
       return "Hello, Chiranjeevi";
    }
    // Method with return type 'int' and two parameters
    static int addNumbers(int a, int b) {
        return a + b;
    }


}
