// Last updated: 1/6/2026, 11:21:57 PM
1class Solution {
2    public int tribonacci(int n) {
3        int[] dp = new int[n+1];
4            Arrays.fill(dp, -1);
5            return tbn(n , dp);
6    }
7    public static int tbn(int n, int[] dp){
8        if(n == 0){
9            return 0;
10        }
11        if( n == 1 || n == 2){
12            return 1;
13        }
14        if(dp[n]!=-1){
15            return dp[n];
16        }
17        int t1 = tbn(n-1,dp);
18        int t2 = tbn(n-2,dp);
19        int t3 = tbn(n-3,dp);
20        return dp[n]=t1+t2+t3;
21    }
22}