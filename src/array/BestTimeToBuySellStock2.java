package array;

public class BestTimeToBuySellStock2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            // Update the lowest price found so far
            minPrice = Math.min(minPrice, price);

            // Calculate profit if sold today and update maxProfit if it's better
            int currentProfit = price - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuySellStock solver = new BestTimeToBuySellStock();

        // Example 1: Buy at 1, Sell at 6, Profit = 5
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit (Ex 1): " + solver.maxProfit(prices1));

        // Example 2: Price only goes down, Profit = 0
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit (Ex 2): " + solver.maxProfit(prices2));
    }
}
