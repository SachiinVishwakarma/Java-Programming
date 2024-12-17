//class of bank account
class BankAccount {


    //instance variable
    private String accountNumber ;
    private String accountHolderName;
    private double balance;

    //static variable
    private static int totalAccounts = 0;
    private static double totalBalance = 0.0;

    // Constructor for  new bank account
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;

      //counts total account and balance
        totalAccounts++;
        totalBalance += initialBalance;
    }

    // Static method to get total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Static method to get total balance across all accounts
    public static double getTotalBalance() {
        return totalBalance;
    }


    // Instance method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalBalance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Instance method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            totalBalance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Instance method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

}
public class Banking_System {
    public static void main(String[] args) {
        // Create multiple BankAccount objects
        BankAccount account1 = new BankAccount("12345", "Pawan Kumar", 5000.0);
        BankAccount account2 = new BankAccount("67890", "Satish Bhagat ", 10000.0);
        BankAccount account3 = new BankAccount("11223", "Sachin Kumar ", 3000.0);

        // Perform transactions
        account1.deposit(2000.0);
        account2.withdraw(5000.0);
        account3.deposit(1500.0);
        account1.withdraw(700.0);

        // Display account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();

        // Display total accounts and total balance using static methods
        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Total balance across all accounts: " + BankAccount.getTotalBalance());
    }
}
