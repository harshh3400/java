// File: OptimizedPrimeCheck.java
import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // 0, 1 are not prime; 2 is the only even prime
        if (num <= 1) {
            isPrime = false;
        } else if (num == 2) {
            isPrime = true;
        } else if (num % 2 == 0) {
            isPrime = false; // eliminate even numbers > 2
        } else {
            // check only odd divisors from 3 to √num
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        sc.close();
    }
}

