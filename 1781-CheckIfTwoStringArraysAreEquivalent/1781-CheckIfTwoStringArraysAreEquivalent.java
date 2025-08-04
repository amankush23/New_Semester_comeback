// Last updated: 8/4/2025, 11:10:22 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return equivalent(word1, word2);
    }
    public static boolean equivalent(String[] w1,String[] w2) {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < w1.length; i++){
            str1 += w1[i];
        }
        for (int i = 0; i < w2.length; i++){
            if(w2.length > 1){
                str2 += w2[i];
            }
            else {
                str2 = w2[i];
            }
        }
        if(str1.equals(str2)) return true;
        else return false;
    }
}