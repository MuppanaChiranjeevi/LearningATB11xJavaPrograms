package ex_07_ConditionalStatements;

import java.util.Scanner;

public class Lab042_switch_statement {
    /**
     *  The switch statement is used to evaluate a variable or expression and matches its value against
     *  multiple possible case values. If a match is found, the corresponding block of code is executed.
     *
     *  The Java switch statement executes one statement from multiple conditions.
     *  It is like if-else-if ladder statement.
     *  The switch statement works with  byte, short, int, long (with its Wrapper type), enums and String.
     *
     *  Syntax:-
     *  switch (expression) {
     *     case value1:
     *         // Code to execute if expression == value1
     *         break;
     *     case value2:
     *         // Code to execute if expression == value2
     *         break;
     *     ...
     *     default:
     *         // Code to execute if none of the cases match
     * }
     *
     *  expression:  variable or expression to be evaluated.
     * 	case: Each case represents a possible value of the expression.
     * 	break: Stops execution. Prevents fall-through to the next case.
     * 	       Without break, the code will "fall through" to the next case and continue executing
     * 	       all subsequent cases until a break or the end of the switch block is reached.
     * 	default: Optional. Executes if none of the case values match the expression.
     *
     * Points to Remember
     * There can be one or N number of case values for a switch expression.
     * The case value must be of switch expression type only.
     * The case value must be literal or constant. It doesn't allow variables.
     * The case values must be unique. In case of duplicate value, it renders compile-time error.
     *
     *
     */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a num between 1-5: ");
            int day=scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Weekend");
            }
            System.out.println("------------------------");
            // You can also use expressions in a switch statement:
            System.out.print("Enter a any num: ");
            int num=scanner.nextInt();
            switch (num % 2) {  // Expression inside switch
                case 0:
                    System.out.println(num + " is Even");
                    break;
                case 1:
                    System.out.println(num + " is Odd");
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println("------------------------");
            // Example: Switch with String
            String fruit = "Mango";

            switch (fruit) {
                case "Apple":
                    System.out.println("Apple is red.");
                    break;
                case "Mango":
                    System.out.println("Mango is yellow.");
                    break;
                case "Banana":
                    System.out.println("Banana is yellow.");
                    break;
                default:
                    System.out.println("Unknown fruit.");
            }
            System.out.println("------------------------");
            // Example: Switch with char
            char code = 'A';
            switch (code){
                default:
                    System.out.println("No Match");
                    break;
                case 65:
                    System.out.println("A=65");
                    break;
                case 'B':
                    System.out.println("B=66");
                    break;
            }
            System.out.println("------------------------");
            int i= 66;
            switch (i){
                default:
                    System.out.println("No Match");
                    break;
                case 65:
                    System.out.println("A=65");
                    break;
                case 'B':
                    System.out.println("B=66");
                    break;
            }
        }
    }

