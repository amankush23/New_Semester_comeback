// Last updated: 9/25/2025, 5:36:31 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) == 1)res+=nums[i];
            else if(map.get(nums[i]) == 2)res-=nums[i];
        }
        return res;
    }
}