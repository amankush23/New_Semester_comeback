// Last updated: 06/02/2026, 13:05:51
1class Solution {
2    public int longestPalindrome(String s, String t) {
3        t = new StringBuilder(t).reverse().toString();
4        
5        int[] ss = lps(s), tt = lps(t);
6        int n = s.length(), m = t.length(), res = 0;
7        int[][] dp = new int[n+1][m+1];
8        for (int i = 0; i < n; ++i) {
9            for (int j = 0; j < m; ++j) {
10                int a = 0;
11                if (s.charAt(i) == t.charAt(j)) {
12                    dp[i+1][j+1] = dp[i][j]+1;
13                    a = 1;
14                }
15                res = Math.max(res, 2*dp[i+1][j+1] + Math.max(ss[i+a], tt[j+a]));
16            }
17        }
18        return res;
19    }
20
21    
22
23    private int[] lps(String s) {
24        int n = s.length(), res[] = new int[n+1];
25        for (int i = 0; i < n; ++i) {
26            for (int j = n-1; j >= i && res[i] < 2; --j) {
27                if (isPalindrome(s, i, j)) {
28                    res[i] = j-i+1;
29                } else {
30                    res[i] = 1;
31                }
32            }
33        }
34        return res;
35    }
36    
37    
38    private boolean isPalindrome(String s, int i, int j) {
39        int left = i;
40        int right = j;
41        while (left < right) {
42            if (s.charAt(left) != s.charAt(right)) {
43                return false;
44            }
45            left++;
46            right--;
47        }
48        return true;
49    }
50}