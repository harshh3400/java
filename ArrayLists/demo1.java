public class demo1 {
  public static void main(String args[]) {
    int age = -1;
    try {
      checkAge(age);
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getAge());

    }
  }

  public static void checkAge(int age) throws InvalidAgeException {
    if (age < 0) {
      throw new InvalidAgeException("Age Cannot br less than zero", age);
    } else {
      System.out.print("Eligiable");
    }
  }
}

class InvalidAgeException extends Exception {
  private int age;

  public InvalidAgeException(String message, int age) {
    super(message);
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}