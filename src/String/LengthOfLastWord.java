package String;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        // Step 1: Remove trailing and leading spaces
        s = s.trim();

        // Step 2: Start from the end and look for the first space
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                // The word starts at index i + 1 and ends at s.length() - 1
                return s.length() - (i + 1);
            }
        }

        // If no space was found, the whole string is one word
        return s.length();
    }

    public static void main(String[] args) {
        LengthOfLastWord solver = new LengthOfLastWord();

        // Example 1: Basic case
        String s1 = "Hello World";
        System.out.println("Example 1: '" + s1 + "' -> " + solver.lengthOfLastWord(s1)); // Output: 5

        // Example 2: Trailing spaces
        String s2 = "   fly me   to   the moon  ";
        System.out.println("Example 2: '" + s2 + "' -> " + solver.lengthOfLastWord(s2)); // Output: 4

        // Example 3: Single word
        String s3 = "luffy";
        System.out.println("Example 3: '" + s3 + "' -> " + solver.lengthOfLastWord(s3)); // Output: 5
    }
}