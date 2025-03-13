package ex_03_Operators;

public class Lab021_LogicalOperators {

    public static void main(String[] args) {
        // Declare some boolean variables
        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        boolean andResult = a && b;
        System.out.println("Logical AND (a && b) with true, false: " + andResult); // Output: false (because b is false)

        // Logical OR (||)
        boolean orResult = a || b;
        System.out.println("Logical OR (a || b) with true, false: " + orResult); // Output: true (because a is true)

        // Logical NOT (!)
        boolean notResult = !a;
        System.out.println("Logical NOT (!a): " + notResult); // Output: false (because a is true)

        // Example with both true values for AND and OR
        a = true;
        b = true;

        // Logical AND (&&) with both true values
        andResult = a && b;
        System.out.println("Logical AND (a && b) with both true: " + andResult); // Output: true (because both are true)

        // Logical OR (||) with both true values
        orResult = a || b;
        System.out.println("Logical OR (a || b) with both true: " + orResult); // Output: true (because at least one is true)

        // Logical NOT (!) on false value
        notResult = !false;
        System.out.println("Logical NOT (!b): " + notResult); // Output: true

        a = true;
        System.out.println(!a);
        System.out.println(!!a);
        System.out.println(!!!a);
    }
}
