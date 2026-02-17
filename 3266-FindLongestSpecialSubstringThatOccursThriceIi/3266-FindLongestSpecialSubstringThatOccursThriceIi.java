// Last updated: 17/02/2026, 10:46:23
class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int[][] freq = new int[26][n + 1];

        char prev = s.charAt(0);
        freq[prev - 'a'][1] = 1;
        int len = 1;

        // Step 1: Count run lengths
        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == prev) {
                len++;
            } else {
                prev = ch;
                len = 1;
            }
            freq[ch - 'a'][len]++;
        }

        int res = -1;

        // Step 2: Find maximum length occurring at least 3 times
        for (int i = 0; i < 26; i++) {
            int prefixSum = 0;
            for (int j = n; j >= 1; j--) {
                prefixSum += freq[i][j];
                if (prefixSum >= 3) {
                    res = Math.max(res, j);
                    break;
                }
            }
        }

        return res;
    }
}