// Last updated: 21/01/2026, 11:57:20
class Solution {
    public static int countPrefixes(String[] words, String s) {

        int n = words.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.startsWith(words[i])) {
                count++;
            }
        }

        return count;
    }
}