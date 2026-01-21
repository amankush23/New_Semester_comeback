// Last updated: 21/01/2026, 11:59:16
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxCap = 0;
        int minCap = 0;
        for (int weight : weights) {
            maxCap += weight;
            minCap = Math.max(minCap, weight);
        }
        while (minCap < maxCap) {
            int mid = minCap + (maxCap - minCap) / 2;
            int day = 1;
            int sum = 0;
            for (int weight : weights) {
                if (sum + weight > mid) {
                    day++;
                    sum = 0;
                }
                sum += weight;
            }
                if (day > days) {
                    minCap = mid + 1;
                }else{
                    maxCap = mid;
                    
                }
        }
        return minCap;
    }

}