// Last updated: 12/19/2025, 10:45:08 PM
1class Solution {
2    public int trap(int[] height) {
3        return trapping_rain_water(height);
4
5    }
6    public static int trapping_rain_water(int arr[]){
7        int n=arr.length;
8        int left[]= new int[n];
9        int right[]=new int[n];
10        left[0]= arr[0];
11        right[n-1]=arr[n-1];
12        //left array
13        for(int i=1;i<n;i++){
14            left[i]=Math.max(left[i-1],arr[i]);
15        }
16        for(int i=n-2;i>=0;i--){
17            right[i]=Math.max(right[i+1],arr[i]);
18        }
19        int sum=0;
20        for(int i=0;i<arr.length;i++){
21            sum=sum+Math.min(left[i],right[i])-arr[i];
22        }return sum;
23    }
24}