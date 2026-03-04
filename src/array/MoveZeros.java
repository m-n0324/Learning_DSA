package array;

import java.util.Arrays; // two pointer approach

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        // lastNonZeroFoundAt keeps track of the index where the next
        // non-zero element should be placed.
        int lastNonZeroFoundAt = 0;

        for (int cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                // Swap the current non-zero element with the
                // element at lastNonZeroFoundAt
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = temp;

                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros solver = new MoveZeros();

        int[] test1 = {0, 1, 0, 3, 12};
        solver.moveZeroes(test1);
        System.out.println("Test 1: " + Arrays.toString(test1));
        // Expected: [1, 3, 12, 0, 0]

        int[] test2 = {0};
        solver.moveZeroes(test2);
        System.out.println("Test 2: " + Arrays.toString(test2));
        // Expected: [0]
    }
}