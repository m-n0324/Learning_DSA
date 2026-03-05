package String;

import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> lToW = new HashMap<>();
        HashMap<String, Character> wToL = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char letter = pattern.charAt(i);
            String word = words[i];

            // Check Letter -> Word mapping
            if (lToW.containsKey(letter)) {
                if (!lToW.get(letter).equals(word)) {
                    return false;
                }
            } else {
                lToW.put(letter, word);
            }

            // Check Word -> Letter mapping
            if (wToL.containsKey(word)) {
                if (wToL.get(word) != letter) {
                    return false;
                }
            } else {
                wToL.put(word, letter);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern solver = new WordPattern();

        // Example 1: true
        System.out.println("Test 1: " + solver.wordPattern("abba", "dog cat cat dog"));

        // Example 2: false (Multiple letters mapping to same word)
        System.out.println("Test 2: " + solver.wordPattern("abba", "dog dog dog dog"));
    }
}