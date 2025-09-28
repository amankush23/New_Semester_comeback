// Last updated: 9/28/2025, 9:29:27 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxCap = 0;
        int minCap = 0;
        for (int weight : weights) {
            maxCap += weight;
            minCap = Math.max(minCap, weight);
        }
        // if(h == 1000000000) return 3;
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