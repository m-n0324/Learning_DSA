package LeetCode;


import java.util.*;

public class MajorityElementHashMap {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = getCardinalityMap(nums);

        int threshold = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > threshold) {
                return entry.getKey();
            }
        }
        return -1;
    }

    private Map<Integer, Integer> getCardinalityMap(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            // Sleeker way to update counts
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) {
        MajorityElementHashMap solver = new MajorityElementHashMap();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("The majority element is: " + solver.majorityElement(nums));
    }
}