// Last updated: 8/4/2025, 11:12:18 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return isPowerOftwo(n);
    }
    public static boolean isPowerOftwo(int n) {
        if(n <= 0) {
            return false;
        }
        
        if(n == 1) {
            return true;
        } 

        if(n%2 == 1) return false;
        return isPowerOftwo(n/2);
    }
}