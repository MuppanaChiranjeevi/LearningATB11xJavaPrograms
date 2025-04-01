package ex_15_Constructors;

class BankAccount {
    // Variables
    String accHolderName;
    double balance;

     BankAccount(String accHolderName, double balance) {
         this.accHolderName=accHolderName;
         this.balance = balance;
    }

    // Methods
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        this.displayBalance();
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Amount tried to withdraw: " + amount);
            System.out.println("Insufficient funds!");
        }
        this.displayBalance();
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
    void displayName() {
        System.out.println("Account Holder Name: "+accHolderName);
    }
    void displayDetails() {
        this.displayName();
        this.displayBalance();
    }
}

public class Lab095_Bank_Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Chiranjeevi",1000);
        account.displayDetails();
        System.out.println("------------------------");
        account.deposit(2000);
        System.out.println("------------------------");
        account.deposit(500);
        System.out.println("------------------------");
        account.withdraw(1000);
        System.out.println("------------------------");
        account.withdraw(5000); // // Should show insufficient funds



    }
}