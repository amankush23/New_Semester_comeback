// Last updated: 1/4/2026, 11:52:20 AM
1class Solution {
2    public int countSubstrings(String s) {
3        int[][] dp = new int[s.length()][s.length()];
4        for(int[] arr : dp){
5            Arrays.fill(arr, -1);
6        }
7        return check(s, 0, 0,dp);
8    }
9    public int check(String s, int i, int j, int[][] dp) {
10        if (i == s.length()) return 0;
11        if (j == s.length()) return check(s, i + 1, i + 1,dp);
12        if(dp[i][j] != -1) return dp[i][j];
13        int count = 0;
14        if(isPalindrome(s, i, j)) count +=1;
15        int pal_sub = count+ check(s, i, j+1,dp);
16        return dp[i][j] = pal_sub;
17    }
18    public boolean isPalindrome(String s, int i, int j) {
19        while (i < j) {
20            if (s.charAt(i) != s.charAt(j)) {
21                return false;
22            }
23            i++;
24            j--;
25        }
26        return true;
27    }
28}
29