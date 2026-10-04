// Last updated: 04/10/2026, 17:21:25
1class Solution {
2    public int maxSubArray(int[] nums) {
3        return Maximum_Sum(nums);
4    }
5    public int Maximum_Sum(int[] arr) {
6		int ans = Integer.MIN_VALUE;
7		int sum=0;
8		for (int i = 0; i < arr.length; i++) {
9			sum+=arr[i];
10			ans = Math.max(ans, sum);
11			if(sum<0) {
12				sum=0;
13			}
14		}
15		return ans;
16	}
17}