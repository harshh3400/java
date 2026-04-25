public class TypeCastingAllTy {
    public static void main(String[] args) {

        // ------------------------------------------
        // WIDENING (Implicit Typecasting)
        // ------------------------------------------

        byte b = 10;
        short s = b;       // byte to short
        int i = s;         // short to int
        long l = i;        // int to long
        float f = l;       // long to float
        double d = f;      // float to double

        System.out.println("Widening Typecasting:");
        System.out.println("byte to short: " + s);
        System.out.println("short to int: " + i);
        System.out.println("int to long: " + l);
        System.out.println("long to float: " + f);
        System.out.println("float to double: " + d);

        // ------------------------------------------
        // NARROWING (Explicit Typecasting)
        // ------------------------------------------

        double d2 = 123.456;
        float f2 = (float) d2;     // double to float
        long l2 = (long) f2;       // float to long
        int i2 = (int) l2;         // long to int
        short s2 = (short) i2;     // int to short
        byte b2 = (byte) s2;       // short to byte

        System.out.println("\nNarrowing Typecasting:");
        System.out.println("double to float: " + f2);
        System.out.println("float to long: " + l2);
        System.out.println("long to int: " + i2);
        System.out.println("int to short: " + s2);
        System.out.println("short to byte: " + b2);

        // ------------------------------------------
        // char typecasting
        // ------------------------------------------

        char c = 'A';
        int charToInt = c;           // char to int (widening)
        char intToChar = (char) 66;  // int to char (narrowing)

        System.out.println("\nChar Typecasting:");
        System.out.println("char to int: " + charToInt);   // Output: 65
        System.out.println("int to char: " + intToChar);   // Output: B
    }
}
