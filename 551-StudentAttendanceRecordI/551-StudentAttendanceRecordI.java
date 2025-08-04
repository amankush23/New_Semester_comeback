// Last updated: 8/4/2025, 11:11:21 PM
class Solution {
    public boolean checkRecord(String s) {
        boolean late = true;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                late = false;
                break;
            }
        }
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                c += 1;
            }
        }
        boolean absent = true;
        if (c >= 2) {
            absent = false;
        }
        return late && absent;
    }
}