// Last updated: 1/4/2026, 3:36:52 PM
1class Solution {
2    public int numDecodings(String s) {
3        int[] dp = new int[s.length()+1];
4        Arrays.fill(dp,-1);
5        return Decode(s,dp);
6    }
7    public int Decode(String s, int[] dp){
8        if(s.length()== 0) return 1;
9        if(s.charAt(0) == '0') return 0;
10        if(dp[s.length()]!=-1) return dp[s.length()];
11        int cnt = 0 ;
12        cnt += Decode(s.substring(1),dp);
13        if(s.length() >= 2){
14            int num = Integer.parseInt(s.substring(0,2));
15            if(num <= 26){
16                cnt += Decode(s.substring(2),dp);
17            }
18        }
19        return dp[s.length()] = cnt;
20    }
21}