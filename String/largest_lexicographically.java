public class largest_lexicographically {
    public static void main(String[] args) {
        String[] arr = {"apple", "mango", "banana", "peach"};
        String largest = arr[0];
        for (String s : arr) {
            if (s.compareTo(largest) > 0) {
                largest = s;
            }
            System.out.println("Largest: " + largest);

    }
}
}
