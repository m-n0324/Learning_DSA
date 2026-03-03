package LeetCode;


import java.util.Arrays;

public class MajorityElementSorting {

    public int majorityElement(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        // The element at the middle index is always the majority element
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        MajorityElementSorting solver = new MajorityElementSorting();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + solver.majorityElement(nums));
    }
}