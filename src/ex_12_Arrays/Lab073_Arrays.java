package ex_12_Arrays;

public class Lab073_Arrays {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6};
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[6]);
        System.out.println(arr.length);

//        System.out.println(arr[arr.length]);// ArrayIndexOutOfBoundsException
//        System.out.println(arr[8]);// ArrayIndexOutOfBoundsException
//        System.out.println(arr[-1]);// ArrayIndexOutOfBoundsException
//        int []array=new int[-1]; // java.lang.NegativeArraySizeException

        System.out.println("---------------------");
        int[] marks={76,85,93,51,69,90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        System.out.println("---for loop----");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("---for each----");
        for(int i:marks){
            System.out.println(i);
        }





    }
}
