// Last updated: 21/01/2026, 11:56:52
class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int i:nums){
            if(i!=0&&i>0){
                pos++;
            }
            else if(i<0){
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
}