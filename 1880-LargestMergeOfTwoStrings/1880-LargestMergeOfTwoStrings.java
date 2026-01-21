// Last updated: 21/01/2026, 11:57:58
class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int i = 0 ; 
        int j = 0 ;
        while(i < n && j < m){
            if(word1.substring(i).compareTo(word2.substring(j))>0){
                sb.append(word1.charAt(i));
                i++;
            }
            else {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        if(i < n) sb.append(word1.substring(i));
        if(j < m) sb.append(word2.substring(j));
        return sb.toString();
    }
}