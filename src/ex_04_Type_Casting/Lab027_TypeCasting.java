package ex_04_Type_Casting;

public class Lab027_TypeCasting {
    /**
     * Type casting is the process of converting a value from one data type to another.
     *
     * There are two types of type casting in java,
     * 1.Implicit (automatic) type casting --> also known as Widening
     * This type of casting occurs when a smaller data type is converted into a larger data type.
     * byte → short → int → long → float → double (from smaller to larger types)
     * Java Compiler does this automatically because there is no risk of losing data.
     *
     * 2.Explicit (manual) type casting    --> also known as Narrowing
     * This type of casting occurs when a larger data type is converted into a smaller data type
     * double → float → long → int → short → byte (from larger to smaller types)
     * This needs to be done manually because there’s a risk of losing data.
     *
     */
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Implicit - automatic - Widening
        System.out.println(a);

        int val  = 300;  // binary form: - 100101100
       // byte b1 = val; // Invalid - Narrowing - Implicit Casting is not allowed.
        byte b2 = (byte)val; // Valid - Narrowing - Explicit Casting - manual.
        //b2 = 00101100 = 44 // can store 8bits=1 byte
        // Data Loss.
        System.out.println(b2);
    }

}
