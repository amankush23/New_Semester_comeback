// Last updated: 8/4/2025, 11:13:52 PM
class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0 as per problem definition (optional in constraints)
        if (needle.isEmpty()) return 0;

        // Loop through haystack to check for substring match
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if substring from current index matches needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // return index of first match
            }
        }

        // If no match found
        return -1;
    }
}
