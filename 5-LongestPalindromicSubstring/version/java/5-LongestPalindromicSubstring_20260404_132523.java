// Last updated: 04/04/2026, 13:25:23
1class Solution {
2    public String longestPalindrome(String s) {
3        return longestPalindromicStr(s);
4    }
5
6    public static String longestPalindromicStr(String str) {
7        String longest = "";
8        for (int i = 0; i < str.length(); i++) {
9            for (int j = i; j < str.length(); j++) { // Fixed loop range
10                String sub = str.substring(i, j + 1); // j+1 to include last character
11                if (isPalindrom(sub) && sub.length() > longest.length()) {
12                    longest = sub;
13                }
14            }
15        }
16        return longest;
17    }
18
19    public static boolean isPalindrom(String s) {
20        int i = 0, j = s.length() - 1; // Fix j index
21        while (i < j) {
22            if (s.charAt(i) != s.charAt(j)) {
23                return false;
24            }
25            i++;
26            j--;
27        }
28        return true;
29    }
30}
31