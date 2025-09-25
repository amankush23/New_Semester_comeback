// Last updated: 9/25/2025, 12:05:47 PM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[201][201];
        return minSum(triangle, 0,0, dp);

    }
    public int minSum(List<List<Integer>> arr, int i, int j, Integer[][] dp){
        if(i == arr.size()){
            return 0;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        return dp[i][j] = arr.get(i).get(j) + Math.min(minSum(arr, i+1, j, dp), minSum(arr, i+1, j+1, dp));
    }

}