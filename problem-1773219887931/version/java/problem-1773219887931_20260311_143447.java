// Last updated: 11/03/2026, 14:34:47
1class NumArray {
2    static int[] prefix;
3    public NumArray(int[] nums) {
4        int n = nums.length;
5        prefix = new int[n];
6        prefix[0] = nums[0];
7        for(int i = 1; i < n; i++){
8            prefix[i] = prefix[i-1] + nums[i];
9        } 
10    }
11    public int sumRange(int left, int right) {
12        if(left == 0) return prefix[right];
13        int sum = prefix[right] - prefix[left-1];
14        return sum;
15    }
16}
17
18/**
19 * Your NumArray object will be instantiated and called as such:
20 * NumArray obj = new NumArray(nums);
21 * int param_1 = obj.sumRange(left,right);
22 */