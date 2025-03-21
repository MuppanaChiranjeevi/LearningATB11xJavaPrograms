package ex_09_While_Do_While;


public class Lab053_While_Loop {
    public static void main(String[] args) {
        int $=10;
        while ($>0){
            System.out.println($);
            $--;
        }
        System.out.println("-----------------------------------");
        int i = 0;
        while (true) {

            i++;
            if (i == 50) {
                break;  // Exits/Terminates the loop
            }
            if (i == 10) {
                continue;  // Skip below code get back to condition
            }
            System.out.println(i);

        }

    }
}
