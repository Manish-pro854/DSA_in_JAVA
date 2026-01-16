package OOPS;

abstract class BankAccount {
    private String accountHolder;
    private int accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String name, int accNo, double balance) {
        this.accountHolder = name;
        this.accountNumber = accNo;
        this.balance = balance;
    }

    // Encapsulation: Getter
    public double getBalance() {
        return balance;
    }

    // Common methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully");
    }

    // Abstract method (must be implemented by child classes)
    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance - amount >= 500) { // minimum balance rule
            balance -= amount;
            System.out.println(amount + " withdrawn from Savings");
        } else {
            System.out.println("Minimum balance must be 500!");
        }
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Current");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class Bank_Managment {
    static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Manish", 101, 5000);
        BankAccount acc2 = new CurrentAccount("Rahul", 102, 3000);

        acc1.deposit(1000);
        acc1.withdraw(2000);

        acc2.deposit(500);
        acc2.withdraw(4000);

        System.out.println("Savings Balance: " + acc1.getBalance());
        System.out.println("Current Balance: " + acc2.getBalance());
    }
}
