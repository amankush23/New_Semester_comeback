// Last updated: 8/4/2025, 11:13:26 PM
class Solution {
    public int lengthOfLastWord(String s) {
        // Trim trailing spaces
        s = s.trim();
        
        // Find the index of the last space
        int lastSpace = s.lastIndexOf(' ');
        
        // Length of last word = total length - index of last space - 1
        return s.length() - lastSpace - 1;
    }
}
