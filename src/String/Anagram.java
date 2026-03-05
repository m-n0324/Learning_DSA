package String;

import java.util.HashMap;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Increase count for s, decrease for t
            countMap.put(sChar, countMap.getOrDefault(sChar, 0) + 1);
            countMap.put(tChar, countMap.getOrDefault(tChar, 0) - 1);
        }

        // If it's an anagram, all values must be 0
        for (int value : countMap.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram solver = new Anagram();

        System.out.println("Test 1 (anagram): " + solver.isAnagram("anagram", "nagaram")); // true
        System.out.println("Test 2 (rat/car): " + solver.isAnagram("rat", "car"));         // false
    }
}