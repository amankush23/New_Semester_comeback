// Last updated: 8/4/2025, 11:14:20 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i+1 ; j  < nums.length; j++){
                if(nums[i]+ nums[j] == target){
                    int[] Arr = {i,j};
                    return Arr;
                }
            }
        } 
        return new int[0];   
    }
}