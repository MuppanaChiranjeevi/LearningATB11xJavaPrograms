package ex_25_ENUM;

public class Lab148_Enum {
    public static void main(String[] args) {
        System.out.println("-----------Main----------------");
//traversing the enum
        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }
        System.out.println("-------------------------");
        Seasons s=Seasons.valueOf("WINTER");
        System.out.println("Value of WINTER is: "+s);
        System.out.println("Ordinal of WINTER is: "+s.ordinal());
        System.out.println("name() of WINTER is: "+s.name());
        System.out.println("Value of SPRING is: "+Seasons.valueOf("SPRING"));
        System.out.println("Index of SUMMER is: "+Seasons.valueOf("SUMMER").ordinal());
        System.out.println("name() of FALL is: "+Seasons.valueOf("FALL").name());


        // Enum types cannot be instantiated
//        Seasons s=new Seasons();

    }

}
enum Seasons {
    WINTER, SPRING, SUMMER, FALL;
    private Seasons() {
        System.out.println("Enum constructor called for: "+this.name());
    }
}
