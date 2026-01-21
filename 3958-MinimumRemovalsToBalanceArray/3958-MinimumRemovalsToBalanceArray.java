// Last updated: 21/01/2026, 11:55:47
// class Solution {
//     public int minRemoval(int[] nums, int k) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         int i=0;
//         int j=0;
//         int count=0;
//         for(int s=0;s<n;s++){
//             if(check(nums,i,j,k)){
//                 j++;
//             }else{
//                 i++;
//                 count++;
//                 j++;
//             }
//         }

//         return count;
//     }
//     public static boolean check(int nums[],int i,int j,int k){
//         int min = nums[i];
//         int mask = min*k;
//         if(nums[j]<=mask){
//             return true;
//         }
//         return false; 
//     }
// }

class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int j = 0;
        int maxWindow = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && nums[j] <= (long) nums[i] * k) {
                j++;
            }
            maxWindow = Math.max(maxWindow, j - i);
        }

        return n - maxWindow;
    }
}