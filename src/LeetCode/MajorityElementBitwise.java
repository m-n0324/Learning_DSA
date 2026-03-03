package LeetCode;

public class MajorityElementBitwise {

    public int majorityElement(int[] nums) {
        int majority = 0;
        int n = nums.length;

        // Iterate through each of the 32 bits of an integer
        for (int i = 0; i < 32; i++) {
            int bit = 1 << i;
            int bitCount = 0;

            // Count how many times this specific bit is set to 1 across all numbers
            for (int num : nums) {
                if ((num & bit) != 0) {
                    bitCount++;
                }
            }

            // If the bit appears in more than half the numbers,
            // it must be part of the majority element.
            if (bitCount > n / 2) {
                majority |= bit;
            }
        }

        return majority;
    }

    public static void main(String[] args) {
        MajorityElementBitwise solver = new MajorityElementBitwise();

        int[] test1 = {3, 2, 3};
        int[] test2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority (Test 1): " + solver.majorityElement(test1)); // 3
        System.out.println("Majority (Test 2): " + solver.majorityElement(test2)); // 2
    }
}