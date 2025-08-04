// Last updated: 8/4/2025, 11:11:58 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 1; 
        while(j < nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                Swap(nums, i, j);
                i++;
                j++;
            }
            else if(nums[i] == 0 && nums[j] == 0){
                j++;
            }
            else if(nums[i] != 0 && nums[j] == 0){
                i++;
                j++;
            }
            else if(nums[i] != 0 && nums[j] != 0){
                i++;
                j++;
            }
        }
    }
    public void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}