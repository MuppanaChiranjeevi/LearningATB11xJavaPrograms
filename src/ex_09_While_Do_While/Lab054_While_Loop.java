package ex_09_While_Do_While;

public class Lab054_While_Loop {
    public static void main(String[] args) {
        int j,i=0;
        System.out.println("Printing Matrix: ");
        while (i<3){
            j=0;
            while (j<3){
                System.out.print("("+i+","+j+")");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
