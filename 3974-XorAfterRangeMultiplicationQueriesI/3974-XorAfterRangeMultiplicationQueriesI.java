// Last updated: 21/01/2026, 11:55:45
import java.util.*;

class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
       
        int[][] mortavexil = queries;

        int kutta = 1_000_000_007;

       
        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];
            for (int aman = l; aman <= r; aman += k) {
                nums[aman] = (int)(((long) nums[aman] * v) % kutta);
            }
        }

        
        int uttar = 0;
        for (int num : nums) uttar ^= num;

        return uttar;
    }
}
