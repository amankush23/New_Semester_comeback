// Last updated: 8/4/2025, 11:09:49 PM
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length - odd.length];
        for(int i =  0, x = 0 , y = 0; i < nums.length; i++){
            if(i % 2 == 0){
                even[x++] = nums[i];
            }
            else{
                odd[y++] = nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        for(int i =  0, x = 0 , y = odd.length-1; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = even[x++];
            }
            else{
                nums[i]  = odd[y--];
            }
        }
        return nums;
    }
}