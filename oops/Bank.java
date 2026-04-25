public class Bank {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount();
    b1.set_balance(2000);
  }
}

class BankAccount {
  private double balance;

  void set_balance(double amount) {
    this.balance = amount;
  }
}