// Last updated: 19/07/2026, 02:07:50
1class Solution {
2    public int trap(int[] arr) {
3        int n =arr.length;
4		int [] left = new int [n];
5		int [] right = new int [n];
6		left[0]=arr[0];
7		for (int i =1; i <n; i++) {
8			left[i]=Math.max(left[i-1], arr[i]);
9		}
10		right[n-1]=arr[n-1];
11		for(int i=n-2; i>=0; i--) {
12			right[i]=Math.max(right[i+1], arr[i]);
13		}
14		int sum=0;
15		for (int i = 0; i <n; i++) {
16			sum= sum + Math.min(left[i], right[i]) -arr[i];
17		}
18		return sum;
19    }
20}
21