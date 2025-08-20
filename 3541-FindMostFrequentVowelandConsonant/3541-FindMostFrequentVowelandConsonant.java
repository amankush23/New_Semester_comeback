// Last updated: 8/20/2025, 10:45:00 PM
class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        String vowels = "aeiou";
        int maxVowel = 0, maxConsonant = 0;

        // Find max vowel and consonant frequencies
        for (int i = 0; i < 26; i++) {
            char ch = (char)(i + 'a');
            if (freq[i] > 0) {
                if (vowels.indexOf(ch) != -1) {  // vowel check
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {  // consonant
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}