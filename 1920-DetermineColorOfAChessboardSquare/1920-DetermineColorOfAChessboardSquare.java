// Last updated: 8/4/2025, 11:10:15 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch1 = coordinates.charAt(0);
        int col = ch1 - 'a';
        
        char ch2 = coordinates.charAt(1);
        int row = ch2 - '0';
        
        if((row + col) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}