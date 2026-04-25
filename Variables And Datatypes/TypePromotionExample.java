public class TypePromotionExample {
    public static void main(String[] args) {

        // Rule 1: byte and short are promoted to int during arithmetic
        byte b1 = 10;
        byte b2 = 20;
        // byte b3 = b1 + b2; // Error: b1 + b2 is promoted to int
        int b3 = b1 + b2;     // Correct way
        System.out.println("byte + byte promoted to int: " + b3);

        // Rule 2: char is promoted to int
        char ch = 'A'; // ASCII of 'A' = 65
        int chVal = ch; // char to int
        System.out.println("char promoted to int: " + chVal);

        // Rule 3: Mixed types are promoted to the largest type
        int i = 10;
        float f = 5.5f;
        float mixResult = i + f; // int promoted to float
        System.out.println("int + float promoted to float: " + mixResult);

        // Rule 4: long and float
        long l = 100L;
        float fl = 10.5f;
        float result = l + fl; // long promoted to float
        System.out.println("long + float promoted to float: " + result);

        // Rule 5: float and double
        float f1 = 12.3f;
        double d = 22.6;
        double fdResult = f1 + d; // float promoted to double
        System.out.println("float + double promoted to double: " + fdResult);

        // Rule 6: boolean does not participate in type promotion
        // boolean flag = true;
        // int res = flag + 1; // ❌ Error: Cannot convert boolean to int

        // Rule 7: No automatic narrowing (explicit casting required)
        int num = 130;
        byte smallNum = (byte) num; // Manual cast (overflow can occur)
        System.out.println("int to byte with casting: " + smallNum);

        // Rule 8: Type promotion in expressions
        byte a = 5;
        byte c = 10;
        // byte sum = a * c; // ❌ Error: promoted to int
        int sum = a * c; // ✅
        System.out.println("byte * byte promoted to int: " + sum);
    }
}
