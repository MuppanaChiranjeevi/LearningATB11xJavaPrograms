package ex_25_ENUM;


public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    public static void main(String[] args) {
        Season s=Season.WINTER;
        System.out.println(s);
        System.out.println(s.ordinal());
        s=Season.SUMMER;
        System.out.println(s.ordinal());
        System.out.println(Season.valueOf("FALL"));
    }
}