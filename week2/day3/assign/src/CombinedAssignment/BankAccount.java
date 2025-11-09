package CombinedAssignment;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    private static int totalAccounts = 0;

    // Constructor
    public BankAccount(int accountNumber, String holderName, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Successfully deposited: ₹" + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient funds. Overdraft not allowed.");
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: ₹" + amount);
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Display account info
    public void displayInfo() {
        System.out.println("Account No: " + accountNumber +
                ", Holder Name: " + holderName +
                ", Balance: ₹" + balance);
    }
}
