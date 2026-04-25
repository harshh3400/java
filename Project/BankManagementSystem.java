import java.io.*;
import java.util.*;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount implements Serializable {
    private int accountNumber;
    private String holderName;
    private double balance;
    private String pin;
    private List<String> transactions = new ArrayList<>();

    public BankAccount(int accountNumber, String holderName, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.pin = pin;
        addTransaction("Account created with balance: " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean authenticate(String pin) {
        return this.pin.equals(pin);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("Withdrawn: " + amount);
        } else {
            throw new InsufficientFundsException("Insufficient balance for withdrawal!");
        }
    }

    public void addTransaction(String detail) {
        transactions.add(new Date() + " - " + detail);
    }

    public void showTransactions() {
        System.out.println("\n--- Transaction History ---");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}

class Bank implements Serializable {
    private Map<Integer, BankAccount> accounts = new HashMap<>();
    private int nextAccountNumber = 1001;

    public BankAccount createAccount(String holderName, double initialDeposit, String pin) {
        BankAccount account = new BankAccount(nextAccountNumber, holderName, initialDeposit, pin);
        accounts.put(nextAccountNumber, account);
        System.out.println("Account created successfully! Account Number: " + nextAccountNumber);
        nextAccountNumber++;
        return account;
    }

    public BankAccount getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public void transferMoney(int fromAcc, int toAcc, double amount) throws InsufficientFundsException {
        BankAccount sender = accounts.get(fromAcc);
        BankAccount receiver = accounts.get(toAcc);

        if (sender != null && receiver != null) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            sender.addTransaction("Transferred " + amount + " to Account " + toAcc);
            receiver.addTransaction("Received " + amount + " from Account " + fromAcc);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Invalid account number(s).");
        }
    }
}

public class BankManagementSystem {
    private static final String FILE_NAME = "bankData.ser";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = loadBank();

        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Login to Account");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(sc.nextLine()); // using nextLine

            switch (choice) {
                case 1:
                    System.out.print("Enter holder name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter initial deposit: ");
                    double deposit = Double.parseDouble(sc.nextLine());

                    System.out.print("Set a 4-digit PIN: ");
                    String pin = sc.nextLine();

                    bank.createAccount(name, deposit, pin);
                    saveBank(bank);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accNo = Integer.parseInt(sc.nextLine());

                    BankAccount acc = bank.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter PIN: ");
                        String pinCheck = sc.nextLine();
                        if (acc.authenticate(pinCheck)) {
                            accountMenu(sc, bank, acc);
                            saveBank(bank);
                        } else {
                            System.out.println("Invalid PIN!");
                        }
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    exit = true;
                    System.out.println("Exiting... Thank you!");
                    saveBank(bank);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }

    private static void accountMenu(Scanner sc, Bank bank, BankAccount acc) {
        boolean logout = false;
        while (!logout) {
            System.out.println("\n--- Account Menu (" + acc.getHolderName() + ") ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transfer Money");
            System.out.println("5. View Transactions");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");

            int ch = Integer.parseInt(sc.nextLine());

            try {
                switch (ch) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double amt = Double.parseDouble(sc.nextLine());
                        acc.deposit(amt);
                        System.out.println("Deposited successfully!");
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wamt = Double.parseDouble(sc.nextLine());
                        acc.withdraw(wamt);
                        System.out.println("Withdrawn successfully!");
                        break;

                    case 3:
                        System.out.println("Current Balance: " + acc.getBalance());
                        break;

                    case 4:
                        System.out.print("Enter receiver account number: ");
                        int to = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter amount to transfer: ");
                        double amtT = Double.parseDouble(sc.nextLine());
                        bank.transferMoney(acc.getAccountNumber(), to, amtT);
                        break;

                    case 5:
                        acc.showTransactions();
                        break;

                    case 6:
                        logout = true;
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter numbers correctly.");
            }
        }
    }

    private static void saveBank(Bank bank) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(bank);
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    private static Bank loadBank() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (Bank) ois.readObject();
        } catch (Exception e) {
            return new Bank(); // fresh bank if no data
        }
    }
}
