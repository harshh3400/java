import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert to binary using built-in method
        String binary = Integer.toBinaryString(decimal);
    
        // Output: Binary number
        System.out.println("Binary representation: " + binary);

        sc.close();
    }
}
