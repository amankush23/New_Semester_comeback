// Last updated: 8/4/2025, 11:12:08 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they can't be anagrams
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // since only lowercase English letters

        // Count characters from both strings
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // increment for s
            count[t.charAt(i) - 'a']--;  // decrement for t
        }

        // If any count is not 0, not an anagram
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }

        return true;
    }
}
