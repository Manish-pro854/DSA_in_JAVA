package Exception_Handling.Bank_Account_Try_Catch;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successfull!");
        } else {
            System.out.println("Deposit Failed!");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsExpection {
        if(amount>balance){
            throw new InsufficientFundsExpection("Insuficient Funds. Your current balance is: "
                    + balance + " and you are trying to withdraw "+ amount);
        }
        balance = balance-amount;
        System.out.println("Withdraw successfully: $" + amount);
    }
}

