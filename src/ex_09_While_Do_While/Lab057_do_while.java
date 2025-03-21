package ex_09_While_Do_While;

public class Lab057_do_while {
    /**
     * A do-while loop in Java is a control flow statement that is used to execute a block of code
     * at least once and then repeatedly executes it as long as a specified condition is true.
     *
     * It’s similar to a while loop, but with one key difference:
     * do-while loop checks the condition at the end of loop body, ensuring code block gets executed at least once, even if the condition is false.
     *
     * A do-while loop is an exit-controlled loop in Java,
     * ->meaning it executes the block of code at least once before checking the condition.
     * Syntax:
     * do{
     * //code to be executed / loop body
     * //update statement
     * }while (condition);
     */
    public static void main(String[] args) {
        int j=1;
        while (j<=10){
            System.out.println(j);
            j++;
        }
        System.out.println("-----------------------------------");
        //initialization
        int i=1;
        //do-while loop
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        System.out.println("-----------------------------------");
        i=1;
        do{
            System.out.println("This will execute 1 time");
            i++;
        }while(i>=10); // condition is false at start
        System.out.println("-----------------------------------");
//        do{
//            System.out.println("infinitive do while loop");
//        }while(true);
    }
}
