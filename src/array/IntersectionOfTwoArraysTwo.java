package array;

import java.util.*;

public class IntersectionOfTwoArraysTwo {

    public int[] intersect(int[] nums1, int[] nums2) {
        // Map to store frequency of elements in nums1
        Map<Integer, Integer> cardi = new HashMap<>();
        for (int num : nums1) {
            cardi.put(num, cardi.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            // Check if we still have this number "in stock" from nums1
            int freq = cardi.getOrDefault(num, 0);
            if (freq > 0) {
                result.add(num);
                // Reduce the count so we don't over-count matches
                cardi.put(num, freq - 1);
            }
        }

        // Convert List<Integer> to int[]
        int[] inter = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            inter[i] = result.get(i);
        }
        return inter;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysTwo solver = new IntersectionOfTwoArraysTwo();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println("Test 1: " + Arrays.toString(solver.intersect(nums1, nums2)));
        // Expected: [2, 2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println("Test 2: " + Arrays.toString(solver.intersect(nums3, nums4)));
        // Expected: [9, 4]
    }
}