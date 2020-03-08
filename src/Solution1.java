import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Solution for LeetCode question 121. Best Time to Buy
 * and Sell Stocks. Brute force method used by using a
 * nested for loop and an ArrayList for array evaluation
 * (maximum value, appending elements to an array dynamically).
 */
public class Solution1 {

    /**
     * Function for finding the optimal purchase and
     * sell prices for stocks.
     * @param prices - an array of integer prices
     * @return the maximum profit
     * @return 0 if a profit cannot be found
     */
    public int maxProfit(int[] prices) {

        /* Create an ArrayList object selling array to dynamically
           add potential prices to an array.
         */
        List<Integer> selling_array = new ArrayList<Integer>();

        /* Outer iteration - go through purchase prices.
           Inner iteration - go through selling prices.
           Compare each purchase price with selling prices of the
           next day (found through the index value).
         */
        for(int i = 0; i < prices.length; i++) {
            for(int j = 1; j < prices.length; j++) {

                /* If the selling price larger than the purchase price
                   and the selling price index is larger than the
                   purchase price, add the difference of purchase and
                   sale price to selling_array.
                 */
                if (i < j && prices[j] > prices[i]) {
                    int temp = prices[j] - prices[i];
                    selling_array.add(temp);
                }
            }
        }

        /* If selling_array is empty, a NoSuchElementException is
           thrown. This conditional checks if selling_array
           contains any values, and returns the maximum, which
           is the most profitable selling condition.
         */
        if (selling_array.size() > 0) {
            return Collections.max(selling_array);
        }

        return 0;
    }

    public static void main(String[] args) {
        int sol = new Solution1().maxProfit(new int[]{7, 6, 5, 3, 1});
        System.out.println(sol);
    }

}
