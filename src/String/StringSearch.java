package String;

public class StringSearch {
    public int strStr(String haystack, String needle) {
        // Edge case: if needle is empty, return 0 (standard behavior in many languages)
        if (needle.isEmpty()) return 0;

        // Ensure haystack is long enough
        if (haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            // Try to match the needle starting at index i
            while (j < needle.length()) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                j++;
            }

            // If we traversed the entire needle, we found a match
            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        StringSearch sol = new StringSearch();

        // Example 1
        String h1 = "sadbutsad", n1 = "sad";
        System.out.println("Example 1: " + sol.strStr(h1, n1)); // Output: 0

        // Example 2
        String h2 = "leetcode", n2 = "leeto";
        System.out.println("Example 2: " + sol.strStr(h2, n2)); // Output: -1

        // Example 3 (Middle match)
        String h3 = "hello", n3 = "ll";
        System.out.println("Example 3: " + sol.strStr(h3, n3)); // Output: 2
    }
}