// Last updated: 8/31/2025, 2:07:44 PM
import java.util.*;

class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int i = 0;
        
        // Extract digits
        while(num > 0) {
            digits[i++] = num % 10;
            num /= 10;
        }
        
        // Sort digits
        Arrays.sort(digits);
        
        // Form two numbers with alternating digits
        int num1 = digits[0] * 10 + digits[2];
        int num2 = digits[1] * 10 + digits[3];
        
        return num1 + num2;
    }
}
