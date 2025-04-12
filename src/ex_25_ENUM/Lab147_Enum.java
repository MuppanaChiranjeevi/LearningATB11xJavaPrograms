package ex_25_ENUM;

public class Lab147_Enum {
    /**
     * An Enum (short for Enumeration) is a special Java data type used to define collections of constants.
     * According to the Java naming conventions, all constants should be written in capital letters.
     * So, we have enum constants in capital letters.
     * Enums provide a type-safe way to work with fixed sets of related constants.
     * Java Enums are similar to classes but they only have a fixed set of constants (a variable that does not change).
     * Java Enum constants are implicitly public, static, and final, so you cannot change them after creation.
     * Enum can have fields, constructors and methods
     * Enums are used to create our own data type like classes.
     * Enum may implement many interfaces but cannot extend another class because they implicitly extend java.lang.Enum class
     * Enum can be traversed.
     * The enum can be defined within or outside the class because it is similar to a class.
     * The semicolon (;) at the end of the enum constants are optional.
     * Note: Constructor of enum type is private. Even if you don’t explicitly write private,
     *       the Java compiler automatically makes the constructor private.
     * Each constant is a singleton instance of the enum.
     * Enum types in Java cannot be instantiated using the new keyword because they are implicitly final and their constructors are private.
     * The ordinal() method returns the position (index) of the enum constant.
     * It starts from 0 for the first constant.
     *
     */
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek days...");
        }
        System.out.println("-----------------------");
        for(Day d:Day.values()){

            System.out.print(d.ordinal()+" ");
            System.out.print(d+" ");
            System.out.println(d.name());
        }
        System.out.println("-----------------------");
        Day d1=Day.MONDAY;
        System.out.println(d1);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.SATURDAY.name());
        System.out.println(Day.WEDNESDAY.ordinal());
        System.out.println(Day.FRIDAY.ordinal());


    }
}
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

}

