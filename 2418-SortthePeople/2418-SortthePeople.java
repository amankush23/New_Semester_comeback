// Last updated: 8/24/2025, 12:14:35 AM
import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
        // Step 1: Create array of pairs
        String[][] people = new String[n][2];
        for (int i = 0; i < n; i++) {
            people[i][0] = names[i];
            people[i][1] = String.valueOf(heights[i]);
        }
        
        // Step 2: Sort by height (descending)
        Arrays.sort(people, (a, b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1]));
        
        // Step 3: Extract names in sorted order
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = people[i][0];
        }
        
        return result;
    }
}
