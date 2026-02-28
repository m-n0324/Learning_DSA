package array;
/**
 * Given an integer array nums and an integer val,
 * remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 *
 *
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 *
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2,
 * with the first two elements of nums being 2.
 * It does not matter what you leave beyond the
 * returned k (hence they are underscores).
 *
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5,
 * with the first five elements of nums containing
 * 0, 0, 1, 3, and 4.
 */
import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int insertLoc = 0;
        for (int i = 0; i < nums.length; i++) {
            // If the current element is NOT the value we want to remove
            if (nums[i] != val) {
                nums[insertLoc] = nums[i];
                insertLoc++;
            }
        }
        // insertLoc now represents the count of elements not equal to val
        return insertLoc;
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        // Example 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        runExample(solution, nums1, val1, 1);

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        runExample(solution, nums2, val2, 2);
    }

    private static void runExample(RemoveElement sol, int[] nums, int val, int exampleNum) {
        System.out.println("--- Example " + exampleNum + " ---");
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Target Value to Remove: " + val);

        int k = sol.removeElement(nums, val);

        System.out.println("Return k: " + k);
        System.out.print("Modified Array (first k elements): [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println();
    }
}