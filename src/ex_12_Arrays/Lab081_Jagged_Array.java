package ex_12_Arrays;

public class Lab081_Jagged_Array {

    public static void main(String[] args) {
        // Declare and initialize a jagged array
        int[][] jaggedArray = new int[3][];  // 3 rows, but the number of columns is not defined yet

        // Initialize each row with different sizes
        jaggedArray[0] = new int[2];  // First row has 2 elements
        jaggedArray[1] = new int[4];  // Second row has 4 elements
        jaggedArray[2] = new int[3];  // Third row has 3 elements

        // Fill the jagged array with values
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;

        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[1][3] = 6;

        jaggedArray[2][0] = 7;
        jaggedArray[2][1] = 8;
        jaggedArray[2][2] = 9;

        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }
    }
}
