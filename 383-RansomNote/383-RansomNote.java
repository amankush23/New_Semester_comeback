// Last updated: 10/17/2025, 9:45:05 PM
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26]; // For lowercase letters a–z

        // Count letters in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Subtract letters used in ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (--freq[c - 'a'] < 0) {
                return false; // Not enough of this letter
            }
        }

        return true;
    }

    // Test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.canConstruct("a", "b"));     // false
        System.out.println(sol.canConstruct("aa", "ab"));   // false
        System.out.println(sol.canConstruct("aa", "aab"));  // true
    }
}
