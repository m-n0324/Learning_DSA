/**
 * Write a function that reverses a string. The
 * input string is given as an array of characters
 * s.
 * You must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 * Constraints:
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 */
package String;

import java.util.Arrays;

public class ReverseString {

    public void reverseString(char[] s) {
        // We only need to go up to the middle of the array
        for (int i = 0; i < s.length / 2; i++) {
            // Standard swap logic
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        ReverseString solver = new ReverseString();

        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        solver.reverseString(s1);
        System.out.println("Result 1: " + Arrays.toString(s1));
        // Expected: [o, l, l, e, h]

        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solver.reverseString(s2);
        System.out.println("Result 2: " + Arrays.toString(s2));
        // Expected: [h, a, n, n, a, H]
    }
}