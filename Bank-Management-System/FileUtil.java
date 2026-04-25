import java.io.*;
import java.util.*;

public class FileUtil {

  private static final String FILE_NAME = "accounts.txt";

  // Load accounts from file
  public static List<Account> loadAccounts() {
    List<Account> accounts = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

      String line;
      while ((line = br.readLine()) != null) {
        accounts.add(Account.fromString(line));
      }

    } catch (IOException e) {
      System.out.println("No existing data found.");
    }

    return accounts;
  }

  // Save accounts to file
  public static void saveAccounts(List<Account> accounts) {

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {

      for (Account acc : accounts) {
        bw.write(acc.toString());
        bw.newLine();
      }

    } catch (IOException e) {
      System.out.println("Error saving data!");
    }
  }
}