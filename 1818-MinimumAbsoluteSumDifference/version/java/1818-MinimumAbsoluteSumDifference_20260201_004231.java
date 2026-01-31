// Last updated: 01/02/2026, 00:42:31
1class Solution {
2    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int[] temp = nums1.clone();
5        Arrays.sort(temp);
6        
7        long sum = 0, minSum;
8        int MOD = 1_000_000_007;
9        
10        for (int i = 0; i < n; i++) {
11            sum += Math.abs(nums1[i] - nums2[i]);
12        }
13        
14        minSum = sum;
15        for (int i = 0; i < n; i++) {
16            int currDiff = Math.abs(nums1[i] - nums2[i]);
17            
18            // binary search
19            int l = 0, r = n - 1;
20            while (l < r) {
21                int mid = l + (r - l) / 2;
22                if (temp[mid] < nums2[i]) l = mid + 1;
23                else r = mid;
24            }
25            
26            int bestDiff = Math.min(currDiff, Math.abs(temp[l] - nums2[i]));
27            if (l > 0) bestDiff = Math.min(bestDiff, Math.abs(temp[l - 1] - nums2[i]));
28            
29            minSum = Math.min(minSum, sum - currDiff + bestDiff);
30        }
31        
32        return (int)(minSum % MOD);
33    }
34}