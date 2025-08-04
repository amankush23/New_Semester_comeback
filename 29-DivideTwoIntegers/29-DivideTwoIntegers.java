// Last updated: 8/4/2025, 11:13:50 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return quotient(dividend, divisor);
    }
    public static int quotient(int num, int div){
        int ans = num / div;
        int trunk = (int) ans; 
        return trunk;
    }
}