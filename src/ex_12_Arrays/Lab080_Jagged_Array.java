package ex_12_Arrays;

public class Lab080_Jagged_Array {
    /**
     * In Java, a jagged array is an array of arrays where each array can have a different number of columns.
     */
    public static void main(String[] args){
        /// 3 rows, but the number of columns is not defined yet
        int arr[][] = new int[4][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        arr[3] = new int[5];
        //initializing a jagged array
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        //printing the data of a jagged array
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}
