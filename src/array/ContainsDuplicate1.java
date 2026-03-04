package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate1 {

    public boolean containsDuplicate(int[] nums) {
        // Set stores only unique elements
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            // .add() returns false if the element is already in the set
            if (!numSet.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solver = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println("Contains Duplicate (nums1): " + solver.containsDuplicate(nums1)); // true
        System.out.println("Contains Duplicate (nums2): " + solver.containsDuplicate(nums2)); // false
    }
}