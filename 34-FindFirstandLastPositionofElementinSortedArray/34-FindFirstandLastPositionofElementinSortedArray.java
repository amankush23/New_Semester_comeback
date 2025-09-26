// Last updated: 9/26/2025, 10:38:08 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        Arrays.fill(arr,-1);
        if(nums==null || nums.length==0) return arr;
        arr[0] = search(nums,target,true);
        arr[1] = search(nums,target,false);
        return arr;
    }
    
    int search(int nums[],int target, boolean isFirst){
        int lo=0,hi=nums.length-1,mid=0;
        int index=-1;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                if(isFirst){
                    index=mid;
                    hi=mid-1;
                }
                
                else{
                    index=mid;
                    lo=mid+1;
                }
            }
            else if(nums[mid]>target) hi=mid-1;
            else lo=mid+1;
        }
        return index;
    }
}