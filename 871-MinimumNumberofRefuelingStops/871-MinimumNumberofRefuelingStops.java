// Last updated: 10/7/2025, 3:29:37 PM
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int fuel = startFuel, stops = 0, i = 0, n = stations.length;
        while (fuel < target) {
            while (i < n && stations[i][0] <= fuel) {
                pq.add(stations[i][1]);
                i++;
            }
            if (pq.isEmpty()) return -1;
            fuel += pq.poll();
            stops++;
        }
        return stops;
    }
}
