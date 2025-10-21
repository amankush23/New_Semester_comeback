// Last updated: 10/21/2025, 10:00:09 PM
class Solution {
    public String removeKdigits(String num, int k) {
        return removeKdigit(num, k);
    }
    public String removeKdigit(String num, int k) {
        if (k == num.length())
            return "0";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (s.length() != 0 && k != 0 && s.charAt(s.length() - 1) > ch) {
                s.setLength(s.length() - 1);
                k--;
            }
            s.append(ch);
        }
        while (k > 0) {
            s.setLength(s.length() - 1);
            k--;
        }
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0')
            i++;
        if (i == s.length())
            return "0";
        return s.substring(i).toString();
    }
}