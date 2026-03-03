package array;

public class BestTimeToBuySellStock {
    /**
     * Finds max profit using Brute Force (checking every pair).
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // Outer loop: potential buying day
        for (int i = 0; i < prices.length - 1; i++) {
            // Inner loop: potential selling day (must be after buy day)
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuySellStock solver = new BestTimeToBuySellStock();

        // Test Case 1: Standard case (Buy at 1, Sell at 6)
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1 - Expected: 5, Result: " + solver.maxProfit(prices1));

        // Test Case 2: Prices only decrease (No profit possible)
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Test 2 - Expected: 0, Result: " + solver.maxProfit(prices2));
    }
}