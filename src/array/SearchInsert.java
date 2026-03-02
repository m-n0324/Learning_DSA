package array;

import java.util.Arrays;

public class SearchInsert {

    // Your original approach (Linear Search)
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] >= target) {
                break;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        SearchInsert solver = new SearchInsert();

        // Test Case 1: Target exists in the middle
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        printResult(nums1, target1, solver.searchInsert(nums1, target1));

        // Test Case 2: Target does not exist (insert in middle)
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        printResult(nums2, target2, solver.searchInsert(nums2, target2));

        // Test Case 3: Target does not exist (insert at the end)
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        printResult(nums3, target3, solver.searchInsert(nums3, target3));

        // Test Case 4: Target does not exist (insert at the start)
        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        printResult(nums4, target4, solver.searchInsert(nums4, target4));
    }

    // Helper method to print the output nicely
    private static void printResult(int[] nums, int target, int result) {
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Insert at Index: " + result);
        System.out.println("---------------------------");
    }
}