// Last updated: 9/1/2025, 11:46:37 PM
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