package ex_07_ConditionalStatements;
enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
public class Lab044_switch_statement {

    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the week.");
                break;
            case FRIDAY:
                System.out.println("Weekend is near!");
                break;
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("A regular day.");
        }
    }
}

