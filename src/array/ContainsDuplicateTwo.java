package array;

/**
 * Given an integer array nums and an integer k,
 * return true if there are two distinct indices
 * i and j in the array such that nums[i] == nums[j]
 * and abs(i - j) <= k.
 *
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * 0 <= k <= 105
 */

import java.util.HashSet;
import java.util.Set; // using Sliding window

public class ContainsDuplicateTwo {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the window exceeds size k, remove the oldest element
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }

            // Try to add the current element.
            // If it returns false, it means a duplicate exists within the current k-window.
            if (!window.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateTwo solver = new ContainsDuplicateTwo();

        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println("Example 1: " + solver.containsNearbyDuplicate(nums1, k1)); // true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println("Example 2: " + solver.containsNearbyDuplicate(nums2, k2)); // true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println("Example 3: " + solver.containsNearbyDuplicate(nums3, k3)); // false
    }
}