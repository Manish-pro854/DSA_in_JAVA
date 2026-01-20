package Exception_Handling.Bank_Account_Try_Catch;

public class Main {
    public static void main(String[] args) {
        try{
            BankAccount bankAccount = new BankAccount(100);
            System.out.println("Current Balance is : "+ bankAccount.getBalance());

            bankAccount.deposit(100);
            System.out.println("Current balance is: " + bankAccount.getBalance());

            bankAccount.withdraw(50);
            System.out.println("Current balance is: " + bankAccount.getBalance());

            bankAccount.withdraw(200);
            System.out.println("Current balance is: " + bankAccount.getBalance());
        } catch (InsufficientFundsExpection e) {
            System.out.println("Please try to check your instruction "+e.getMessage());
        }

    }
}
