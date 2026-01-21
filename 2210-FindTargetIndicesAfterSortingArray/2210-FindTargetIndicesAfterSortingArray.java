// Last updated: 21/01/2026, 11:57:34
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int cnt  = 0;
        int lesser = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i:nums){
            if(i==target) cnt++;
            else if(i<target) lesser++;
        }
        for(int i=0 ; i<cnt ; i++){
            ans.add(lesser);
            lesser++;
        }
        return ans;
    }
}