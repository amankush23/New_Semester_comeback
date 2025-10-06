// Last updated: 10/7/2025, 12:30:48 AM
class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int n = stack.length();
            if (n > 0 && Math.abs(stack.charAt(n - 1) - c) == 32) {
                stack.deleteCharAt(n - 1); // remove the bad pair
            } else {
                stack.append(c); // add current character
            }
        }
        
        return stack.toString();
    }
}
