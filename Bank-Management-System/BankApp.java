import java.util.Scanner;

public class BankApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    BankService bank = new BankService();
    try {
      while (true) {
        System.out.println("\n--- BANK MENU ---");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

          case 1:
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            bank.createAccount(accNo, name, balance);
            break;

          case 2:
            System.out.print("Enter Account Number: ");
            accNo = sc.nextInt();

            System.out.print("Enter Deposit Amount: ");
            double dep = sc.nextDouble();

            if (dep <= 0) {
              System.out.println("Amount must be positive!");
              break;
            }

            bank.deposit(accNo, dep);
            break;

          case 3:
            System.out.print("Enter Account Number: ");
            accNo = sc.nextInt();

            System.out.print("Enter Withdraw Amount: ");
            double wd = sc.nextDouble();

            if (wd <= 0) {
              System.out.println("Amount must be positive!");
              break;
            }

            bank.withdraw(accNo, wd);
            break;

          case 4:
            System.out.print("Enter Account Number: ");
            accNo = sc.nextInt();

            bank.checkBalance(accNo);
            break;

          case 5:
            System.out.println("Thank you for using Bank System!");
            System.exit(0);

          default:
            System.out.println("Invalid choice!");
        }

      }
    } catch (Exception e) {
      System.out.println("Invalid input! Please enter correct value.");
      sc.nextLine(); // clear buffer
    }
  }
}