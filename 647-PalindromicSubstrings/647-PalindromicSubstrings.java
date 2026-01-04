// Last updated: 1/4/2026, 11:44:35 AM
1class Solution {
2    public int countSubstrings(String s) {
3        return check(s, 0, 0);
4    }
5    public int check(String s, int i, int j) {
6        if (i == s.length()) return 0;
7        if (j == s.length()) return check(s, i + 1, i + 1);
8        int count = 0;
9        if(isPalindrome(s, i, j)) count +=1;
10        return count+ check(s, i, j+1);
11    }
12    public boolean isPalindrome(String s, int i, int j) {
13        while (i < j) {
14            if (s.charAt(i) != s.charAt(j)) {
15                return false;
16            }
17            i++;
18            j--;
19        }
20        return true;
21    }
22}
23