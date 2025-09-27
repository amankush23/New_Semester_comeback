// Last updated: 9/27/2025, 8:52:33 AM
class Solution {
    public boolean possibleHai(int[] time, long givenTime, int totalTrips) {
        long actualTrips = 0;
        for (int t : time) {
            actualTrips += givenTime / t;
        }
        return actualTrips >= totalTrips;
    }

    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        long l = 1;
        long r = (long) Arrays.stream(time).min().getAsInt() * totalTrips;

        while (l < r) {
            long mid_time = l + (r - l) / 2;
            if (possibleHai(time, mid_time, totalTrips)) {
                r = mid_time;
            } else {
                l = mid_time + 1;
            }
        }
        return l;
    }
}
