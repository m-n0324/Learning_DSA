/**
 * You are given a large integer represented as an
 * integer array digits, where each digits[i] is
 * the ith digit of the integer. The digits are
 * ordered from most significant to least significant
 * in left-to-right order. The large integer does
 * not contain any leading 0's.
 *
 * Increment the large integer by one and return
 * the resulting array of digits.
 *
 *
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 *
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 *
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 *
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */
package array;
import java.util.Arrays;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int carry = 1;

        // Your logic: Iterate backwards and update carry/digits using math
        for (int i = digits.length - 1; carry > 0 && i >= 0; i--) {
            int temp = carry;
            carry = (digits[i] + carry) / 10;
            digits[i] = (digits[i] + temp) % 10;
        }

        // If carry is 0, we are done and can return the original array
        if (carry == 0) {
            return digits;
        } else {
            // If carry is still 1, we need to expand (e.g., 999 -> 1000)
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                res[i + 1] = digits[i];
            }
            return res;
        }
    }

    public static void main(String[] args) {
        PlusOne solver = new PlusOne();

        // Example 1: Standard case
        int[] n1 = {1, 2, 3};
        System.out.println("Input: [1,2,3] -> Output: " + Arrays.toString(solver.plusOne(n1)));

        // Example 2: Carry ripple
        int[] n2 = {4, 3, 2, 1};
        System.out.println("Input: [4,3,2,1] -> Output: " + Arrays.toString(solver.plusOne(n2)));

        // Example 3: The '99' case (Expansion)
        int[] n3 = {9, 9};
        System.out.println("Input: [9,9] -> Output: " + Arrays.toString(solver.plusOne(n3)));
    }
}