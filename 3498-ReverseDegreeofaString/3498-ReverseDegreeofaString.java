// Last updated: 8/30/2025, 11:45:04 PM
class Solution {
    public int reverseDegree(String s) {
        return reverseDeg(s);
    }int count=0;
    public int reverseDeg(String s){
        for(int i = 0 ; i< s.length(); i++){
            count += getReverseDegree(s.charAt(i))*(i+1);
        }
        return count;
    }
    public static int getReverseDegree(char c) {
        if (c >= 'a' && c <= 'z') {
            int offset = c - 'a';
            return 26 - offset;
        } else {
            throw new IllegalArgumentException("Input must be a lowercase English letter.");
        }
    }
}