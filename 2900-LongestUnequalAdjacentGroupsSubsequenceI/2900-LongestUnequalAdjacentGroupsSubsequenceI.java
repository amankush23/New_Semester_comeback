// Last updated: 1/5/2026, 10:41:16 PM
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        List<String> result = new ArrayList<>();
4        result.add(words[0]);
5
6        for (int i = 1; i < words.length; i++) {
7            if (groups[i] != groups[i - 1]) {
8                result.add(words[i]);
9            }
10        }
11
12        return result;
13    }
14}