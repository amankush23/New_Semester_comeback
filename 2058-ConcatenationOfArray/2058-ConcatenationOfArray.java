// Last updated: 8/4/2025, 11:10:09 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        return ConctOfArray(nums);
    }
    public static int[] ConctOfArray(int[] arr){
        int n = arr.length;
        int[] arr2 = new int[2*n];
        
            for(int i = 0; i < n; i++){
                arr2[i] = arr[i];
                arr2[i+n] =arr[i];
            }
            return arr2;
        }
}