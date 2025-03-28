package ex_12_Arrays;

public class Lab071_Arrays {
    /**
     * In Java, an array is a collection of elements of the same/similar data type.
     * The elements of an array are stored in a contiguous memory location.
     * Array is also called as Homogeneous data structure.- meaning all elements must be of the same data type.
     * Once an array is created, its size is fixed and cannot be changed.
     * Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
     * Elements of an array are accessed using their index, starting at 0.
     *
     * There are two types of array.
     * 1. Single Dimensional Array
     * 2. Multidimensional Array
     *
     * Declaration – Defining the array type and name.
     * Instantiation – Allocating memory for the array using the new keyword.
     * Initialization – Assigning values to the array.
     *
     * Syntax to Declare an Array in Java
     * 1. dataType[] arrayName; ;
     * 2. dataType []arrayName;
     * 3. dataType arrayName[];
     *
     * Syntax to Instantiation of Arrays in java
     * arrayName = new dataType[size];
     *
     * Syntax for DECLARATION AND INSTANTIATION
     * dataType[] arrayName= new datatype[size];
     */
    public static void main(String[] args) {
        // Declaration
        int[] numbers;    // Recommended
        int []numbers1;    // Also valid
        String names[];    // Also valid

        // Instantiation
        numbers = new int[5];  // Creates an array of size 5 with default values (0 for int)
        names = new String[3]; // Creates an array of size 3 with default values (null)

        // DECLARATION AND INSTANTIATION
        int[] num=new int[10];
        String[] s=new String[5];

        // Direct Initialization
        int[] values = {11, 13, 17, 19};  // Single-Step declaration, instantiation and initialization
        String[] names1 = {"Alice", "Bob", "Eve"}; // String array
        double[] prices = {9.99, 19.99, 29.99};  // Double array

        // Initialization using new keyword
        int[] nums = new int[]{10, 20, 30, 40, 50}; // declare an array and initialize it using the new keyword.
        String[] snames = new String[]{"chiru", "manasa", "Manisha", "infosys", "bdcdcdcj"};


        // Initialization of array elements using index
        int[] digits=new int[5]; //Declaration and instantiation
        digits[0]=100; // Initialising values individually using index
        digits[1]=200;
        digits[2]=300;
        digits[3]=400;
        digits[4]=500;

        String[] nam = new String[3]; // Declaration and instantiation
        nam[0] = "Alice";             // Initialising values individually using index
        nam[1] = "Bob";
        nam[2] = "Eve";


        int[] chiru = new int[5];
        for (int i = 0; i < chiru.length; i++) {
            chiru[i] = i * 10;
        }


        int[] value4;       // DECLARATION
        value4= new int[]{10, 76, 98, 76, 42};    //to initialize already declared array

        int[] value3;       // DECLARATION
        value3=new int[5];  //INSTANTIATION
        value3= new int[]{10, 76, 98, 76, 42};    //to initialize already instantiated array



    }
}
