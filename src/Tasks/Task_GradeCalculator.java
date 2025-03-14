package Tasks;

public class Task_GradeCalculator {
    public static void main(String[] args) {
        int score=Integer.parseInt(args[0]);
        String res= (score <0 || score >100)?"Enter the score between 0 and 100":
                (score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        System.out.println("Your Grage is: "+res);
    }
}
