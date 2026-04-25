package app;

// Import the class from the other folder/package
import tools.RandomMaths;

public class Main {
  public static void main(String[] args) {
    System.out.println("Starting application...");

    // Call the method from the imported class
    RandomMaths.printRandomNumber();
  }
}