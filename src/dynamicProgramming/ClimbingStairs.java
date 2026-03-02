/**
 * You are climbing a staircase. It takes n steps
 * to reach the top.
 *
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to
 * the top?
 *
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 *
 * Constraints:
 * 1 <= n <= 45
 */
package dynamicProgramming;

public class ClimbingStairs {

    /**
     * The number of ways to reach step n is:
     * f(n) = f(n-1) + f(n-2)
     */
    public int climbStairs(int n) {
        // Base cases
        if (n <= 1) return 1;
        if (n == 2) return 2;

        int first = 1;  // Ways to reach step 1
        int second = 2; // Ways to reach step 2
        int current = 0;

        // Start calculating from step 3 up to n
        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }

        return current;
    }

    public static void main(String[] args) {
        ClimbingStairs solver = new ClimbingStairs();

        // Example 1: n = 2
        // Output: 2 (1+1, 2)
        System.out.println("Ways for 2 stairs: " + solver.climbStairs(2));

        // Example 2: n = 3
        // Output: 3 (1+1+1, 1+2, 2+1)
        System.out.println("Ways for 3 stairs: " + solver.climbStairs(3));

        // Example 3: n = 5
        // Output: 8
        System.out.println("Ways for 5 stairs: " + solver.climbStairs(5));
    }
}