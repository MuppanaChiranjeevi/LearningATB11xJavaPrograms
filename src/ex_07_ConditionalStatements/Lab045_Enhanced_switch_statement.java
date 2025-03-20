package ex_07_ConditionalStatements;

public class Lab045_Enhanced_switch_statement {
        // Uses -> arrow syntax to remove the need for break statements.
        public static void main(String[] args) {
            int day = 4;

            String result = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                default -> "Weekend";
            };

            System.out.println(result);

            switch (day) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                default -> System.out.println("Weekend");
            };
        }
    }
