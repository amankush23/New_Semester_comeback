// Last updated: 8/4/2025, 11:12:57 PM
class Solution {
    public int maxProfit(int[] prices) {
        return Max_Profit(prices);
    }

    public static int Max_Profit(int[] arr) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            int ans = arr[i] - min;
            if (ans > profit) {
                profit = ans;
            }
        }

        // if (profit > 0) {
            return profit;
        // } else {
        //     return 0;
        // }
    }
}