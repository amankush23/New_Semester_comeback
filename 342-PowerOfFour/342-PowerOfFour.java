// Last updated: 8/4/2025, 11:11:52 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        return isPowerOffour(n);
    }
    public static boolean isPowerOffour(int n) {
        if(n <= 0) {
            return false;
        } 
        if(n == 1) {
            return true;
        }

        if(n%4 != 0) return false;

        return isPowerOffour(n/4);
    }
}