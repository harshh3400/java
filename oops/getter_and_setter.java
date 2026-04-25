public class getter_and_setter {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Harshad", "7021374130", "Saving",35000);
        b1.displayAccountInfo();
        b1.deposit(100000);
        b1.displayAccountInfo();
    }
}
// Class representing a Bank Account
class BankAccount {
    // Private instance variables
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private String accountType;

    // Constructor using 'this' to refer to instance variables
    public BankAccount(String accountHolderName, String accountNumber, String accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getter for Account Holder Name
    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    // Setter for Account Holder Name using 'this'
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid Name!");
        }
    }

    // Getter for Balance
    public double getBalance() {
        return this.balance;
    }

    // Deposit method using 'this'
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method using 'this'
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Getter for Account Type
    public String getAccountType() {
        return this.accountType;
    }

    // Setter for Account Type using 'this'
    public void setAccountType(String accountType) {
        if (accountType.equalsIgnoreCase("Savings") || accountType.equalsIgnoreCase("Current")) {
            this.accountType = accountType;
        } else {
            System.out.println("Invalid Account Type!");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("\n--- Account Info ---");
        System.out.println("Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: " + this.balance);
    }
}

/*
Getter and Setter in Java:

1. Getters:
   - Used to read or get the value of a private variable.
   - Follows naming convention: getVariableName()

2. Setters:
   - Used to update or set the value of a private variable.
   - Follows naming convention: setVariableName()

3. Why use Getter and Setter?
   - For **Encapsulation** (hiding internal data).
   - To provide **controlled access** to private fields.
   - Can add validation logic in setters.

4. Important:
   - Variables should be private.
   - Access them using public getter and setter methods.
*/
