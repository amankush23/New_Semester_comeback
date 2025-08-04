// Last updated: 8/4/2025, 11:09:12 PM
import java.util.*;
class Solution {
    public int scoreOfString(String s) {
        int sum = 0; 
        for(int i = 0 ; i < s.length()-1; i++){
                sum += Math.abs(s.charAt(i) - s.charAt(i+1));
            }
        return sum;
    }
}