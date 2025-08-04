// Last updated: 8/4/2025, 11:09:14 PM
class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]+ nums[1] <= nums[2] || nums[0] + nums[2]<= nums[1] || nums[1]+nums[2]<=nums[0]){
            return "none";
        }else {
        if (nums[0] == nums[1]) {
            if (nums[0] == nums[2]) {
                return "equilateral";
            } else {
                return "isosceles";
            }
        } else if (nums[0] == nums[2] || nums[1]==nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
        }
    }
}
