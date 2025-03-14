package ex_04_Type_Casting;

public class Lab030_TypeCasting_Usage {
    public static void main(String[] args) {
        int bill=999;
        double gst=0.18*bill;

        int total=bill+(int)gst;   //narrowing
        System.out.println("Total Bill: "+total);

        double sum=bill+gst;      // widening
        System.out.println("Total Bill: "+sum);
    }
}
