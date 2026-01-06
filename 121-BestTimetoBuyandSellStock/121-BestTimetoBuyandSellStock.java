// Last updated: 1/6/2026, 3:15:23 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        return Max_Profit(prices);
4    }
5
6    public static int Max_Profit(int[] arr) {
7        int profit = 0;
8        int min = Integer.MAX_VALUE;
9        
10        for (int i = 0; i < arr.length; i++) {
11            if (arr[i] < min) {
12                min = arr[i];
13            }
14            int ans = arr[i] - min;
15            if (ans > profit) {
16                profit = ans;
17            }
18        }
19            return profit;
20    }
21}