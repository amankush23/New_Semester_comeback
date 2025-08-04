// Last updated: 8/4/2025, 11:11:07 PM
class Solution {
    public List<Integer> partitionLabels(String s) {

        if(s == null || s.length() == 0){
            return null;
        }
        List<Integer> out_arr = new ArrayList();
        int[] idx = new int[26];
        for(int i = 0 ; i < s.length(); i++){
            idx[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0 ;
        for(int i = 0 ; i < s.length();i++){
            end = Math.max(end, idx[s.charAt(i)-'a']);
            if(i == end){
                out_arr.add(end-start+1);
                start = end+1;
            }

        }
        return out_arr;
    }
}