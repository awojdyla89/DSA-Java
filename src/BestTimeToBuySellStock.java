
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one
stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Iterate over the prices
We update min_price to the lowest values found
as we continue, we check the next price and subract from min_price get a profit value
update the profit value when greater than the last
return the greatest profit

Time complexity: O(n). Only a single pass is needed.
Space complexity: O(1). Only two variables are used.
*/

public class BestTimeToBuySellStock {

    public int maxProfit(int[] prices){
        int min_price = prices[0];
        int max_profit = 0;

        for (int i = 0; i < prices.length ; i++) {
            if(prices[i] < min_price){
                min_price = prices[i];
            } else if (prices[i] - min_price > max_profit) {
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        BestTimeToBuySellStock sell = new BestTimeToBuySellStock();

        int[] prices1 = new int[]{7,1,5,3,6,4};
        int[] prices2 = new int[]{7,6,4,3,1};

        System.out.println(sell.maxProfit(prices1));
        System.out.println(sell.maxProfit(prices2));

    }
}
