// Last updated: 8/23/2025, 11:32:20 PM
import java.util.HashSet;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Step 1: Put allowed chars in a HashSet
        HashSet<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        
        int count = 0;
        
        // Step 2: Check each word
        for (String word : words) {
            boolean isConsistent = true;
            
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            
            if (isConsistent) count++;
        }
        
        return count;
    }
}
