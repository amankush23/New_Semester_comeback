// Last updated: 28/01/2026, 22:03:24
1class Solution {
2    int mod = (1000000007);
3    public int countTexts(String pressedKeys) {
4         int[] key = new int[] {0,0,3,3,3,3,3,4,3,4};
5         int n = pressedKeys.length();
6         int[] dp = new int[n];
7        Arrays.fill(dp,-1);
8         return solve(0,pressedKeys,key,dp);
9    }
10    public int solve(int ind , String s ,int[] key,int[]dp){
11        if(ind==s.length()){
12            return 1;
13        }
14        if(dp[ind]!=-1) return dp[ind];
15        int count = 0;
16        int num = s.charAt(ind)-'0';
17        int rep = key[num];
18        for(int i =0;i<rep && ind+i<s.length() && s.charAt(ind)==s.charAt(ind+i);i++){
19            count += solve(ind+1+i,s,key,dp);
20            count %= mod;
21        }
22        return dp[ind] = count;
23    }
24}