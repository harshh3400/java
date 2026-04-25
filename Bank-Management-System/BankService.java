import java.util.ArrayList;
import java.util.List;

public class BankService {

  private List<Account> accounts;

  // Constructor
  public BankService() {
    accounts = FileUtil.loadAccounts();
  }

  public void createAccount(int accNo, String name, double balance) {
    accounts.add(new Account(accNo, name, balance));
    FileUtil.saveAccounts(accounts);
    System.out.println("Account created successfully!");
  }

  public Account findAccount(int accNo) {
    for (Account acc : accounts) {
      if (acc.getAccountNumber() == accNo) {
        return acc;
      }
    }
    return null;
  }

  public void deposit(int accNo, double amount) {

    if (amount <= 0) {
      System.out.println("Invalid amount!");
      return;
    }

    Account acc = findAccount(accNo);

    if (acc != null) {
      acc.deposit(amount);
      FileUtil.saveAccounts(accounts);
      System.out.println("Deposit successful!");
    } else {
      System.out.println("Account not found!");
    }
  }

  public void checkBalance(int accNo) {
    Account acc = findAccount(accNo);

    if (acc != null) {
      System.out.println("Balance: " + acc.getBalance());
    } else {
      System.out.println("Account not found!");
    }
  }

  public void withdraw(int accNo, double amount) {
    Account acc = findAccount(accNo);

    if (acc != null) {
      try {
        acc.withdraw(amount);
        FileUtil.saveAccounts(accounts);
        System.out.println("Withdrawal successful!");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } else {
      System.out.println("Account not found!");
    }
  }

}