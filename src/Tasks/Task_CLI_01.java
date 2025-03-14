package Tasks;

public class Task_CLI_01 {
    public static void main(String[] args) {
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        double salary= Double.parseDouble(args[2]);

        System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary);
    }
}
