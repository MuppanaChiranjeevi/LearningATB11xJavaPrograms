package ex_03_Operators;

public class Lab023_Interview_QnA01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b); //  // Math

        // concatination
        String first_name = "Pramod";
        String last_name = "Dutta";
        System.out.println(first_name+last_name);

        // + -> behave differently with the data type.
        // + -> operator overloading

        System.out.println(first_name + last_name + a + b);
        // // PramodDutta1020 --> first operator(+) performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));
    }
}
