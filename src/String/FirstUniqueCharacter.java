package String;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        // Option A: Your HashMap logic (Versatile - works for all characters)
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Option B: Array logic (Optimized for lowercase a-z)
        // int[] count = new int[26];
        // for (char c : s.toCharArray()) count[c - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter solver = new FirstUniqueCharacter();

        System.out.println("Test 1 (leetcode): " + solver.firstUniqChar("leetcode"));     // 0 (l)
        System.out.println("Test 2 (loveleetcode): " + solver.firstUniqChar("loveleetcode")); // 2 (v)
        System.out.println("Test 3 (aabb): " + solver.firstUniqChar("aabb"));           // -1
    }
}