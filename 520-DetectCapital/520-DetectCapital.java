// Last updated: 8/4/2025, 11:11:24 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||          // Case 1: All uppercase
               word.equals(word.toLowerCase()) ||          // Case 2: All lowercase
               (Character.isUpperCase(word.charAt(0)) && 
                word.substring(1).equals(word.substring(1).toLowerCase())); // Case 3
    }
}
