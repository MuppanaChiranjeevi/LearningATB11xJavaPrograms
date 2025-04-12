package ex_25_ENUM;

public class Lab151_ENUM {
    public static void main(String[] args) {
       // Get enum constant using ordinal
        Months mon = Months.values()[2];
        System.out.println(mon);

        // Get ordinal using enum constant
        int ordinal = Months.MAR.ordinal();
        System.out.println(ordinal);
        System.out.println("---------------------");
        for(int i =0;i<Months.values().length;i++){
            System.out.println(i+" "+Months.values()[i]);
        }
        System.out.println("---------------------");
        Months[] monarr=Months.values();
        for(Months m:monarr){
            System.out.print(m.ordinal());
            System.out.print(" "+m+" ");
            System.out.println(m.name());
        }
    }
}

enum Months{
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;

}
