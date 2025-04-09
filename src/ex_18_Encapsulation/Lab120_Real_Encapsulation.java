package ex_18_Encapsulation;

public class Lab120_Real_Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Can't access private fields directly:
        // account.balance = 10000;
        // System.out.println(account.accountNumber); // Compile error

        // Must use public methods
        account.deposit(500.0);
        account.withdraw(200.0);

        System.out.println("Account balance: " + account.getBalance());
        System.out.println("Account Number: " + account.getAccountNumber());
    }
}
class BankAccount {
    // Private fields (data hiding)
    private String accountNumber;
    private double balance;

    // Public constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public getter methods (controlled access)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Public setter methods with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}