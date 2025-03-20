package ex_08_Loops;

public class Lab46_ForLoop {
    /**
     *A for loop in Java is a control structure that allows you to repeatedly execute a block of code
     * for a specific number of times.
     * for (initialization; condition; update) {
     *     // Code to be executed
     * }
     *Initialization: Here, we can initialize the variable, or we can use an already initialized variable.
     *                It is an optional condition. This is executed once, before the loop starts.
     * Condition: A boolean expression evaluated before each iteration.
     *            If it evaluates to true, the code inside the loop runs.
     *            If it evaluates to false, the loop terminates.
     * Update: This is executed after each iteration.
     *          It updates the loop variable (like incrementing or decrementing a counter).
     */
    public static void main(String[] args) {
        //Code of Java for loop
        for(int i=1;i<=10;i++){  // 1 to 10
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        for(int i=0;i<10;++i){   // 0 to 9
            System.out.println(i);
        }

        System.out.println("-------------------------------------");
        for(int i=10;i>0;i--){   // 10 to 1
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        for(int i=10;i>=0;--i){   // 10 to 0
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        for(int __=0;__<10;__++){
            System.out.println("Num is: "+__);
        }

        System.out.println("-------------------------------------");

        for (int i = 0; i > 1 ; i++) { // condition  false not entered loop
            System.out.println(i);
        }
        for (int i = 0;i>10 ;) { // condition  false not entered loop
            System.out.println("Hello");
        }
        System.out.println("condition false");
    }


}
