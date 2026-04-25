public class string_immutable {
    /*

Why Strings are immutable in Java:

1. Security:
   - Strings store sensitive info (passwords, URLs, file paths).
   - If mutable, malicious code could change values in memory.
   - Example: Changing "https://bank.com" to "https://hackersite.com" without permission.

2. String Pool efficiency:
   - Java reuses string objects from a common pool to save memory.
   - If mutable, changing one pooled string would change it for all references → unexpected bugs.

3. Thread-safety:
   - Immutability allows safe sharing of the same string between multiple threads without synchronization.

4. Hashcode caching:
   - Strings are often used as keys in hash-based collections.
   - Since they never change, their hashcode can be cached for faster lookups.
   - Mutable strings would break HashMap/HashSet behavior if values change after insertion.

Conclusion:
   - Immutability improves security, performance, and thread safety.
   - Any string modification actually creates a new String object.
*/
}
