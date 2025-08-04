// Last updated: 8/4/2025, 11:14:07 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Take the first string as reference
        String prefix = strs[0];

        // Compare the prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // While the current string doesn't start with the prefix
            while (!strs[i].startsWith(prefix)) {
                // Reduce the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
