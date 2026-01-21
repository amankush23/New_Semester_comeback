// Last updated: 21/01/2026, 11:57:39
import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freq = new HashMap<>();
        
        // Count frequency of each string
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        
        // Traverse in original order to find kth distinct
        int count = 0;
        for (String s : arr) {
            if (freq.get(s) == 1) { // distinct string
                count++;
                if (count == k) {
                    return s;
                }
            }
        }
        
        return "";
    }
}
