package String;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {

    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            // Move i forward until it hits a vowel
            while (i < j && !isVowel(letters[i])) {
                i++;
            }

            // Move j backward until it hits a vowel
            while (i < j && !isVowel(letters[j])) {
                j--;
            }

            // Swap the vowels
            if (i < j) {
                char temp = letters[i];
                letters[i] = letters[j];
                letters[j] = temp;
                i++;
                j--;
            }
        }
        return new String(letters);
    }

    private boolean isVowel(char c) {
        // Using a string lookup is fine, or you could use:
        // return "aeiouAEIOU".indexOf(c) != -1;
        char lower = Character.toLowerCase(c);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    public static void main(String[] args) {
        ReverseVowels solver = new ReverseVowels();

        System.out.println("Input: 'hello' -> Output: " + solver.reverseVowels("hello")); // holle
        System.out.println("Input: 'leetcode' -> Output: " + solver.reverseVowels("leetcode")); // leotcede
    }
}