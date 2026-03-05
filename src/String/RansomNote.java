package String;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        // Frequency array for 26 lowercase letters
        int[] counts = new int[26];

        // Fill the "bank" with available letters from the magazine
        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }

        // Spend letters to build the ransom note
        for (char c : ransomNote.toCharArray()) {
            counts[c - 'a']--;
            // Optimization: check immediately if we ran out of this letter
            if (counts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        RansomNote solver = new RansomNote();

        System.out.println("Test 1 (a, b): " + solver.canConstruct("a", "b"));      // false
        System.out.println("Test 2 (aa, ab): " + solver.canConstruct("aa", "ab"));   // false
        System.out.println("Test 3 (aa, aab): " + solver.canConstruct("aa", "aab")); // true
    }
}