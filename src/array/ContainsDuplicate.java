package array;

import java.util.Arrays;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        // Step 1: Sort the array.
        // This brings duplicates together.
        Arrays.sort(nums);

        // Step 2: Compare adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solver = new ContainsDuplicate();

        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("Test 1 [1,2,3,1]: " + solver.containsDuplicate(test1)); // true
        System.out.println("Test 2 [1,2,3,4]: " + solver.containsDuplicate(test2)); // false
        System.out.println("Test 3: " + solver.containsDuplicate(test3));             // true
    }
}