// Last updated: 17/02/2026, 10:46:14
class Solution {
    public int minOperations(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && i<nums.length-2){
                cnt++;
                nums[i]=1;
                nums[i+1]=(nums[i+1]^1);
                nums[i+2]=(nums[i+2]^1);
            }
        }
        if(nums[nums.length-2]==0 || nums[nums.length-1]==0){
            return -1;
        }

        return cnt;
    }
}