package ex_17_Polymorphism.Method_Overriding;

public class Lab117_Real_Overriding_Example {
    public static void main(String[] args) {
        BankAccount regularAccount = new BankAccount(1000);
        BankAccount savingsAccount = new SavingsAccount(1000, 200);

        regularAccount.withdraw(800);  // Allowed
        regularAccount.displayBalance();  // Balance: 200

        savingsAccount.withdraw(900);  // Not allowed (would go below 200)
        savingsAccount.displayBalance();  // Balance remains 1000
    }
}
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double minimumBalance;

    public SavingsAccount(double initialBalance, double minBalance) {
        super(initialBalance);
        this.minimumBalance = minBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrew from savings: " + amount);
        } else {
            System.out.println("Cannot withdraw - would go below minimum balance!");
        }
    }
}

