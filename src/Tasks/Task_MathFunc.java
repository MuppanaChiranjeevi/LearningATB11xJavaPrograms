package Tasks;

public class Task_MathFunc {
    public static void main(String[] args) {
        int X = 10, Y = 10, Z = 10, P=2;
        double result=Math.cbrt(Math.pow(X,P)+Math.pow(Y,P)-Math.abs(Z));
        System.out.println("Result: "+result);

    }
}
