public class Account {

  private int accountNumber;
  private String name;
  private double balance;

  // Constructor
  public Account(int accountNumber, String name, double balance) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
  }

  // Getter methods
  public int getAccountNumber() {
    return accountNumber;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  // Deposit method
  public void deposit(double amount) {
    balance += amount;
  }

  // Withdraw method
  public void withdraw(double amount) throws Exception {
    if (amount > balance) {
      throw new Exception("Insufficient Balance!");
    }
    balance -= amount;
  }

  @Override
  public String toString() {
    return accountNumber + "," + name + "," + balance;
  }

  public static Account fromString(String data) {
    String[] parts = data.split(",");
    return new Account(
        Integer.parseInt(parts[0]),
        parts[1],
        Double.parseDouble(parts[2]));
  }

  public static void main(String[] args) {
    Account a1 = new Account(123, "Harshad", 2000);
    System.out.println(a1.getAccountNumber());
    ;
  }
}
