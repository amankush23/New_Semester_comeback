// Last updated: 29/01/2026, 21:31:53
1class Solution {
2    public int tupleSameProduct(int[] nums) {
3        HashMap<Integer, Integer> productCount = new HashMap<>();
4        int result = 0;
5
6        for (int i = 0; i < nums.length; i++)
7            for (int j = i+1; j < nums.length; j++) {
8                int product = nums[i] * nums[j];
9                result += 8 * productCount.getOrDefault(product, 0);
10                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
11            }
12
13        return result;
14    }
15}