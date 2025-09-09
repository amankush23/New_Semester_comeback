// Last updated: 9/9/2025, 9:35:38 PM
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