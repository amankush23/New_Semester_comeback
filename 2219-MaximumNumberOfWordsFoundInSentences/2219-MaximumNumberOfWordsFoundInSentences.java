// Last updated: 21/01/2026, 11:57:33
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            // Split by space to count words
            int wordCount = sentence.split(" ").length;
            
            // Update maximum
            maxWords = Math.max(maxWords, wordCount);
        }
        
        return maxWords;
    }
}
