// Last updated: 8/4/2025, 11:13:12 PM
class Solution {
    public void sortColors(int[] nums) {
        BubbleSort(nums);
    }
    public static void BubbleSort(int[] arr){
        for(int turn = 1; turn < arr.length; turn++){
            for(int i  = 0 ; i < arr.length-turn;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}