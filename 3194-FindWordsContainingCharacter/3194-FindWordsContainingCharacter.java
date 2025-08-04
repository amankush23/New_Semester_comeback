// Last updated: 8/4/2025, 11:09:18 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for(int i  = 0; i < words.length; i++){
            for(int j = 0; j< words[i].length(); j++){
                if(words[i].charAt(j) == x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}