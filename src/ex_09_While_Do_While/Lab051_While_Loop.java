package ex_09_While_Do_While;

public class Lab051_While_Loop {
    /**
     *Java while loop is a control flow statement used to repeatedly execute a block of code
     *as long as a specified condition evaluates to true.
     *Once the condition becomes false, the line immediately after the loop in the program gets executed.
     * Syntax:
     * while (condition){
     * //code to be executed
     * Increment / decrement statement
     * }
     *A while loop in Java is an entry-controlled loop.
     * Means the condition is evaluated before the execution of the loop body.
     */
        public static void main(String[] args) {
            int i = 1;
            while (i <= 5) {
                System.out.println(i);
                i++;
            }

            System.out.println("-----------------------------------");

//            while (true) {
//                System.out.println("This will run forever");
//            }
            System.out.println("-----------------------------------");

            int x = 10;
            while (x < 0) { // condition false at start
                System.out.println("This won’t print.");
            }

            System.out.println("-----------------------------------");

            i=1;
            while (i>0){ // condition always true -> Infinite loop
                System.out.println(i);
                i++;
            }

        }
    }

