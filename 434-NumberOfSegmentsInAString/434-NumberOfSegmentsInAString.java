// Last updated: 8/4/2025, 11:11:33 PM
class Solution {
    public int countSegments(String s) {
        
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        String[] segments = s.trim().split("\\s+");
        return segments.length;
    }
}
