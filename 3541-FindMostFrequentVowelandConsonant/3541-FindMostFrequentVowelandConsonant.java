// Last updated: 9/27/2025, 9:12:11 AM
import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        int vMax = 0;
        int cMax = 0;
        HashSet<Character> v = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        for (char k : m.keySet()) {
            int f = m.get(k);
            if (v.contains(k)) {
                if (f > vMax) vMax = f;
            } else {
                if (f > cMax) cMax = f;
            }
        }

        return vMax + cMax;
    }
}
