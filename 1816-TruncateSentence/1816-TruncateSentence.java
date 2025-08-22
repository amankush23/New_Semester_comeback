// Last updated: 8/22/2025, 3:55:57 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < k ; i++){
            str.append(words[i]);
            if(i < k-1){
                str.append(" ");
            }
        }
        return str.toString();
    }
}