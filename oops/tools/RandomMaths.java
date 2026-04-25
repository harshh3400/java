package tools;

public class RandomMaths {
  // A simple method we want to use in another folder
  public static void printRandomNumber() {
    double random = Math.random() * 100;
    System.out.println("Your random number is: " + (int) random);
  }
}