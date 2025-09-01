// Last updated: 9/1/2025, 11:12:53 PM
class Solution {
    public int countDigitOne(int n) {
        long factor = 1; // current digit position
        long count = 0;
        
        while (factor <= n) {
            long high = n / (factor * 10);
            long curr = (n / factor) % 10;
            long low = n % factor;
            
            if (curr == 0) {
                count += high * factor;
            } else if (curr == 1) {
                count += high * factor + (low + 1);
            } else {
                count += (high + 1) * factor;
            }
            
            factor *= 10;
        }
        
        return (int) count;
    }
}
