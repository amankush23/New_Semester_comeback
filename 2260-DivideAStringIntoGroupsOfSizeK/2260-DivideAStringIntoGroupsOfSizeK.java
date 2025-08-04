// Last updated: 8/4/2025, 11:09:54 PM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int totalGroups = (n + k - 1) / k; 
        String[] result = new String[totalGroups];

        int index = 0;
        for (int i = 0; i < n; i += k) {
            int end = Math.min(i + k, n);
            String group = s.substring(i, end);

            
            if (group.length() < k) {
                StringBuilder sb = new StringBuilder(group);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                group = sb.toString();
            }

            result[index++] = group;
        }

        return result;
    }
}
