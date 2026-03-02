/**
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order. You must write an algorithm with O(log n) runtime
 * complexity.
 * <p>
 * <p>
 * Example 1: Input: nums = [1,3,5,6], target = 5 Output: 2
 * <p>
 * Example 2: Input: nums = [1,3,5,6], target = 2 Output: 1
 * <p>
 * Example 3: Input: nums = [1,3,5,6], target = 7 Output: 4
 * <p>
 * <p>
 * Constraints: 1 <= nums.length <= 104 -104 <= nums[i] <= 104 nums contains
 * distinct values sorted in ascending order. -104 <= target <= 104
 * ------BINARY SEARCH APPORACH-------
 */

package array;

import java.util.Arrays;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int beg = 0, end = nums.length - 1;

        while (beg <= end) {
            int mid = beg + (end - beg) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // Target is in the left half
                end = mid - 1;
            } else {
                // Target is in the right half
                beg = mid + 1;
            }
        }

        // If the loop ends, 'beg' is the insertion index
        return beg;
    }

    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();

        // Example 1: Target is found
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Example 1 (Target 5): Expected 2, Actual " + solution.searchInsert(nums1, target1));

        // Example 2: Target not found (insert in middle)
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Example 2 (Target 2): Expected 1, Actual " + solution.searchInsert(nums2, target2));

        // Example 3: Target not found (insert at the end)
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Example 3 (Target 7): Expected 4, Actual " + solution.searchInsert(nums3, target3));

        // Example 4: Target not found (insert at the beginning)
        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        System.out.println("Example 4 (Target 0): Expected 0, Actual " + solution.searchInsert(nums4, target4));
    }
}