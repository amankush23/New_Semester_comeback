// Last updated: 10/6/2025, 2:49:38 PM
import java.util.*;

class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length() + 1][p.length() + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        return match(s, p, 0, 0, dp);
    }

    public boolean match(String s, String p, int i, int j, int[][] dp) {
        if (i >= s.length() && j >= p.length()) {
            return true;
        }
        if (j >= p.length()) {
            return false;
        }
        if (i >= s.length()) {
            while (j < p.length()) {
                if (p.charAt(j) != '*') return false;
                j++;
            }
            return true;
        }
        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }
        boolean ans;
        if (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j)) {
            ans = match(s, p, i + 1, j + 1, dp);
        } else if (p.charAt(j) == '*') {
            ans = match(s, p, i + 1, j, dp) || match(s, p, i, j + 1, dp);
        } else {
            ans = false;
        }
        dp[i][j] = ans ? 1 : 0;
        return ans;
    }
}
