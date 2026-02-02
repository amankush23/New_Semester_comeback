// Last updated: 02/02/2026, 21:36:42
1class Solution {
2    public int maximumLength(String s) {
3        int n = s.length();
4        int[][] freq = new int[26][n + 1];
5
6        char prev = s.charAt(0);
7        freq[prev - 'a'][1] = 1;
8        int len = 1;
9
10        // Step 1: Count run lengths
11        for (int i = 1; i < n; i++) {
12            char ch = s.charAt(i);
13
14            if (ch == prev) {
15                len++;
16            } else {
17                prev = ch;
18                len = 1;
19            }
20            freq[ch - 'a'][len]++;
21        }
22
23        int res = -1;
24
25        // Step 2: Find maximum length occurring at least 3 times
26        for (int i = 0; i < 26; i++) {
27            int prefixSum = 0;
28            for (int j = n; j >= 1; j--) {
29                prefixSum += freq[i][j];
30                if (prefixSum >= 3) {
31                    res = Math.max(res, j);
32                    break;
33                }
34            }
35        }
36
37        return res;
38    }
39}