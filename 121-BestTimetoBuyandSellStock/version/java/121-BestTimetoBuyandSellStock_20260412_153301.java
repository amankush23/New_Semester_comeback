// Last updated: 12/04/2026, 15:33:01
1class Solution {
2    public int maxProfit(int[] prices) {
3        return solve(prices);
4    }
5    public int solve(int[] arr){
6        int maxP =0;
7        int prof = Integer.MAX_VALUE;
8        for(int i = 0 ; i< arr.length; i++){
9            if(arr[i] < prof){
10                prof = arr[i];
11            }
12            int currP = arr[i] - prof;
13            if(maxP < currP){
14                maxP = currP;
15            }
16        }
17        return maxP;
18    }
19}