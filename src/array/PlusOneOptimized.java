package array;
import java.util.Arrays;

public class PlusOneOptimized {

    public int[] plusOne(int[] digits) {
        // Iterate from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the digit is not 9, increment and we are done!
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, it becomes 0 and the loop continues (carry)
            digits[i] = 0;
        }

        // If we reach here, it means all digits were 9 (e.g., 999)
        // The loop turned them all to 0 (e.g., 000)
        // We just need a new array starting with 1 (e.g., 1000)
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        PlusOneOptimized solver = new PlusOneOptimized();

        // Test Case 1: Simple increment
        int[] n1 = {1, 2, 3};
        System.out.println("123 + 1 = " + Arrays.toString(solver.plusOne(n1)));

        // Test Case 2: Middle carry
        int[] n2 = {1, 9, 9};
        System.out.println("199 + 1 = " + Arrays.toString(solver.plusOne(n2)));

        // Test Case 3: All 9s
        int[] n3 = {9, 9, 9};
        System.out.println("999 + 1 = " + Arrays.toString(solver.plusOne(n3)));
    }
}