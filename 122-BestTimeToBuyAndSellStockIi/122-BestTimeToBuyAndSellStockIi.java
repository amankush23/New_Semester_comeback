// Last updated: 8/4/2025, 11:12:55 PM
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0; i<prices.length-1; i++){
            int j=i+1;
            if(prices[j] > prices[i]){
                profit += prices[j] - prices[i];
            }
        }
        return profit;
    }
}