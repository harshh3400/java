
public class operatorsall {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println(a + b);  // Addition: 10 + 3 = 13
        System.out.println(a - b);  // Subtraction: 10 - 3 = 7
        System.out.println(a * b);  // Multiplication: 10 * 3 = 30
        System.out.println(a / b);  // Division: 10 / 3 = 3 (integer division)
        System.out.println(a % b);  // Modulus: 10 % 3 = 1 (remainder)

        // 2. Relational (Comparison) Operators
        System.out.println(a == b);  // Equal to: false
        System.out.println(a != b);  // Not equal to: true
        System.out.println(a > b);   // Greater than: true
        System.out.println(a < b);   // Less than: false
        System.out.println(a >= b);  // Greater than or equal to: true
        System.out.println(a <= b);  // Less than or equal to: false

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println(x && y);  // Logical AND: false
        System.out.println(x || y);  // Logical OR: true
        System.out.println(!x);      // Logical NOT: false

        // 4. Assignment Operators
        int num = 5;
        num += 3;  // Same as num = num + 3 → num = 8
        System.out.println(num);
        num -= 2;  // num = num - 2 → num = 6
        System.out.println(num);
        num *= 2;  // num = num * 2 → num = 12
        System.out.println(num);
        num /= 3;  // num = num / 3 → num = 4
        System.out.println(num);
        num %= 3;  // num = num % 3 → num = 1
        System.out.println(num);

        // 5. Unary Operators
        int p = 5;
        System.out.println(++p);  // Pre-increment: p becomes 6
        System.out.println(p++);  // Post-increment: prints 6, then p becomes 7
        System.out.println(--p);  // Pre-decrement: p becomes 6
        System.out.println(p--);  // Post-decrement: prints 6, then p becomes 5
        System.out.println(+p);   // Unary plus: value remains 5
        System.out.println(-p);   // Unary minus: value becomes -5

        // 6. Bitwise Operators
        int m = 5;     // Binary: 0101
        int n = 3;     // Binary: 0011
        System.out.println(m & n);  // AND: 0101 & 0011 = 0001 → 1
        System.out.println(m | n);  // OR:  0101 | 0011 = 0111 → 7
        System.out.println(m ^ n);  // XOR: 0101 ^ 0011 = 0110 → 6
        System.out.println(~m);     // NOT: ~0101 = 1010 (2's comp) → -6
        System.out.println(m << 1); // Left shift: 0101 << 1 = 1010 → 10
        System.out.println(m >> 1); // Right shift: 0101 >> 1 = 0010 → 2

        // 7. Ternary Operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";  // condition ? true : false
        System.out.println(result);  // Output: Adult

        // 8. instanceof Operator
        String str = "Java";
        System.out.println(str instanceof String);  // true: str is instance of String class
    }
}

