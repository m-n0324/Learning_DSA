/**
 * Given an integer array nums sorted in
 * non-decreasing order, return an array of the
 * squares of each number sorted in non-decreasing
 * order.
 *
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes
 * [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 */
package array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        // Fill the result array from largest to smallest
        for (int i = n - 1; i >= 0; i--) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[i] = leftSq;
                left++;
            } else {
                result[i] = rightSq;
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray solver = new SquaresOfSortedArray();

        int[] input = {-4, -1, 0, 3, 10};
        int[] result = solver.sortedSquares(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(result));
        // Expected: [0, 1, 9, 16, 100]
    }
}