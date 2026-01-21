// Last updated: 21/01/2026, 11:57:38
class Solution {
    public boolean areNumbersAscending(String s) {
        String[] parts = s.split(" ");
        int prev = -1;
        for (String part : parts) {
            if (part.matches("\\d+")) {
                int num = Integer.parseInt(part);
                if (num <= prev) return false;
                prev = num;
            }
        }
        return true;
    }
}