public class ArmstrongNumber {
  public static void main(String[] args) {
    System.out.println(isArmstrong(121));
  }

  static boolean isArmstrong(int n) {
    int temp = n;
    int count = 0;
    while (temp > 0) {
      count++;
      temp = temp / 10;
    }
    int sum = 0;
    temp = n;
    while (temp > 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, count);
      temp = temp / 10;
    }
    return sum == n;
  }
}