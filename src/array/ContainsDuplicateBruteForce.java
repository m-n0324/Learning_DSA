package array;

public class ContainsDuplicateBruteForce {

    public boolean containsDuplicate(int[] nums) {
        // Outer loop picks each element one by one
        for (int i = 0; i < nums.length; i++) {
            // Inner loop compares the picked element with the rest of the array
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found!
                }
            }
        }
        return false; // No duplicates found after checking all pairs
    }

    public static void main(String[] args) {
        ContainsDuplicateBruteForce solver = new ContainsDuplicateBruteForce();

        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};

        System.out.println("Brute Force Test 1: " + solver.containsDuplicate(test1)); // true
        System.out.println("Brute Force Test 2: " + solver.containsDuplicate(test2)); // false
    }
}