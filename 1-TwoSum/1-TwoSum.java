// Last updated: 11/10/2025, 10:56:41 PM
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