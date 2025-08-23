// Last updated: 8/23/2025, 11:29:41 PM
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
