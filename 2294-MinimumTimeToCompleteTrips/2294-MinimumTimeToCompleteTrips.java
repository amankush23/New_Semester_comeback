// Last updated: 21/01/2026, 11:57:26
class Solution {
    public boolean possibleHai(int[] time, long givenTime, int tt) {
        long actualTrips = 0;
        for (int t : time) {
            actualTrips += givenTime / t;
        }
        return actualTrips >= tt;
    }

    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        long l = 1;
        long r = (long) Arrays.stream(time).min().getAsInt() * totalTrips;

        while (l < r) {
            long mid = l + (r - l) / 2;
            if (possibleHai(time, mid, totalTrips)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}