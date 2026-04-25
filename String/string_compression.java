public class string_compression {
    public static String compress(String str) {
    String newStr = "";

    // Loop through the string
    for (int i = 0; i < str.length(); i++) {
        int count = 1;

        // Count consecutive repeating characters
        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }

        // Add current character
        newStr += str.charAt(i);

        // Add count if greater than 1
        if (count > 1) {
            newStr += count;
        }
    }

    return newStr;
}

    public static void main(String[] args) {
        System.out.println(compress("aabbcc"));
    }
}
