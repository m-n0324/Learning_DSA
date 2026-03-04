package String;

import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // sToT: Maps characters from s to t
        // tToS: Maps characters from t back to s to ensure 1-to-1 mapping
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // If sChar already maps to something else, or tChar already maps back to something else
            if (sToT.getOrDefault(sChar, tChar) != tChar ||
                    tToS.getOrDefault(tChar, sChar) != sChar) {
                return false;
            }

            sToT.put(sChar, tChar);
            tToS.put(tChar, sChar);
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings solver = new IsomorphicStrings();

        System.out.println("egg, add: " + solver.isIsomorphic("egg", "add"));     // true
        System.out.println("foo, bar: " + solver.isIsomorphic("foo", "bar"));     // false
        System.out.println("paper, title: " + solver.isIsomorphic("paper", "title")); // true
    }
}