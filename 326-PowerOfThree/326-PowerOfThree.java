// Last updated: 8/4/2025, 11:11:55 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        return isPowerOfthree(n);
    }
    public static boolean isPowerOfthree(int n) {
        if(n <= 0) {
            return false;
        } 
        if(n == 1) {
            return true;
        }

        if(n%3 != 0) return false;

        return isPowerOfthree(n/3);
    }
}