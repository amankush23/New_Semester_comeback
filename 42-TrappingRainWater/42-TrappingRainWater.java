// Last updated: 8/4/2025, 11:13:38 PM
class Solution {
    public int trap(int[] height) {
        return trapping_rain_water(height);

    }
    public static int trapping_rain_water(int arr[]){
        int n=arr.length;
        int left[]= new int[n];
        int right[]=new int[n];
        left[0]= arr[0];
        right[n-1]=arr[n-1];
        //left array
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+Math.min(left[i],right[i])-arr[i];
        }return sum;
    }
}