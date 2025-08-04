// Last updated: 8/4/2025, 11:09:30 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        return diff(nums);
    }
    public static int diff(int[] arr){
        int sum = 0;
        int aksharKaJod = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
            aksharKaJod+=digit(arr[i]);
            
        }
        return sum-aksharKaJod;
    }
    public static int digit(int num){
        int s = 0 ;
        while(num > 0){
            int a = num % 10;
            s += a;
            num/=10;
        }
        return s;
    }
}