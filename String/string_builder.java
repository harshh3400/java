/*
Why we use StringBuilder in Java:

1. Strings are immutable:
   - In Java, once a String is created, its value cannot be changed.
   - Any modification (concatenation, replace, etc.) creates a NEW String object.
   - Example:
       
2. StringBuilder is mutable:
   - Allows modifying the same object without creating new ones.
   - Example:
       StringBuilder sb = new StringBuilder("Hello");
       sb.append(" World"); // Changes happen in the same object.

3. Performance:
   - StringBuilder is faster for repeated modifications (loops, concatenations).
   - Example:
       // BAD: String (creates many objects)
       String str = "";
       for (int i = 0; i < 1000; i++) {
           str += i;
       }
       // GOOD: StringBuilder (same object modified)
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < 1000; i++) {
           sb.append(i);
       }

4. Extra features:
   - append()   → add text
   - insert()   → insert text at index
   - replace()  → replace part of text
   - delete()   → remove part of text
   - reverse()  → reverse the characters

5. Thread Safety:
   - StringBuilder is NOT thread-safe (better performance in single-threaded cases).
   - For thread-safe operations, use StringBuffer instead.

Conclusion:
   - Use StringBuilder when you need efficient and frequent string modifications
     in single-threaded environments.
*/

public class string_builder {
    public static void main(String[] args) {
        String s = "Hello";
        s = s + " World"; // Creates a new object, old one is discarded.

        // Normal String: String (creates many objects)
       String str = "";
       for (int i = 0; i < 1000; i++) {
           str += i;
           System.out.println(str);
           //time:n^2
       }
       // StringBuilder: StringBuilder (same object modified)
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < 1000; i++) {
           sb.append(i);
           //time:O(1000)
       }
    }
}
