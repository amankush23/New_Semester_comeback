// Last updated: 06/04/2026, 15:10:37
1class Solution {
2    public int trap(int[] height) {
3        return solve(height);
4    }
5    public int solve(int[] arr){
6        int n = arr.length;
7        int[] left = new int[n];
8        int[] right = new int[n];
9        left[0] = arr[0];
10        right[n-1] = arr[n-1];
11        for(int i = 1; i < n ;i++){
12            left[i] = Math.max(left[i-1], arr[i]);
13        }
14        for(int i = n-2; i >= 0 ;i--){
15            right[i] = Math.max(right[i+1], arr[i]);
16        }
17        int sum = 0;
18        for(int i = 0 ; i < n ;i++){
19            sum = sum + Math.min(left[i], right[i])- arr[i];
20        }
21        return sum;
22    }
23}