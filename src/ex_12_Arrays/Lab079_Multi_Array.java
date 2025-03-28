package ex_12_Arrays;

public class Lab079_Multi_Array {
    /**
     * In Java,A multidimensional array is an array of arrays where each element can be an array itself.
     * This can be visualized as a table (like a matrix) with rows and columns.
     * You can create a multidimensional array of any dimension, but the most commonly used are two-dimensional and three-dimensional arrays.
     *
     *Syntax to Declare Multidimensional Array in Java
     * 1. dataType[][] arrayRefVar; (or)
     * 2. dataType [][]arrayRefVar; (or)
     * 3. dataType arrayRefVar[][]; (or)
     * 4. dataType []arrayRefVar[];
     *
     * Syntax for DECLARATION AND INSTANTIATION 2D array:
     * dataType[][] arrayRefVar = new dataType[rowsize][columnsize];
     * Note: The second dimension, i.e., the column size is optional.
     */
    public static void main(String[] args) {
        // DECLARATION
        int[][] a;
        int[] []b;
        int [][]c;
        int []d[];
        int e[][];
        int[][]f;  // all are valid 2D declarations

        // INSTANTIATION
        f=new int[2][2];
        e=new int[3][];  // valid INSTANTIATIONs  -> column size is optional
      //  d=new int[][2];  // invalid INSTANTIATION -> rowsize is mandatory

        // DECLARATION AND INSTANTIATION
        int[][] arr=new int[3][3];

        // declaration, instantiation and initialization
        int[][] arr1={{1,2},
                      {3,4},
                      {5,6}}; // 3 x 2
        int[][] arr2=new int[][]{{1,2,3},
                                 {4,5,6},
                                 {7,8,9}}; // 3 x 3

        //to initialize already instantiated 2Darray
        arr=new int[][]{{11,22,33},{44,55,66},{77,88,99}};


        System.out.println("--------------------------");
        int[][] numbers=new int[3][3];
        numbers[0][0]=10;
        numbers[0][1]=20;
        numbers[0][2]=30;
        numbers[1][0]=40;
        numbers[1][1]=50;
        numbers[1][2]=60;
        numbers[2][0]=70;
        numbers[2][1]=80;
        numbers[2][2]=90;
        // Accessing and printing elements of the 2D array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        int[][] matrix={{100,200},
                        {300,400},
                        {500,600}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        for(int[] j:matrix){
            for(int i:j){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        int[][] arr2D=new int[][]{{11,22,33},{44,55,66},{77,88,99}};

        for(int[] j:arr2D){
            for(int i:j){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        int[][] matrix_1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix_2 = {{1, 2}, {3, 4}};
        int[][] matrix_3 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix_4 = {{1}, {3}, {5}};
        System.out.println(matrix_1.length+" x "+matrix_1[0].length);
        System.out.println(matrix_2.length+" x "+matrix_2[0].length);
        System.out.println(matrix_3.length+" x "+matrix_3[0].length);
        System.out.println(matrix_4.length+" x "+matrix_4[0].length);






    }
}
