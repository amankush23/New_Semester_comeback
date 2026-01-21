// Last updated: 21/01/2026, 11:56:17
class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Remove the last non-digit (only if exists)
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                // Add character to stack
                stack.append(ch);
            }
        }
        
        return stack.toString();
    }
}
