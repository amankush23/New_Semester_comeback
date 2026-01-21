// Last updated: 21/01/2026, 11:55:43
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder xy = new StringBuilder();
        for(int i = k-1; i >= 0; i--){
            xy.append(s.charAt(i));
        }
        for(int i = k ; i < s.length();i++){

            xy.append(s.charAt(i));
        }
    return xy.toString();
    }
}