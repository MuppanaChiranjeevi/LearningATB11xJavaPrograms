package Tasks;

public class Task_CLI_02 {
    public static void main(String[] args) {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        String res=num1>num2?num1+" is Maximum":num2+" is Maximum";
        System.out.println(res);
    }
}
