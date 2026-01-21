// Last updated: 21/01/2026, 11:59:49
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        return carFleets( target,  position, speed); 
    }
    public int carFleets(int target, int[] position, int[] speed) {
        int n = position.length;

        double[][] pair = new double[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a, b) -> Double.compare(a[0], b[0]));

        Stack<Double> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            double time = (target - pair[i][0]) / pair[i][1];

            if (!stack.isEmpty() && time <= stack.peek()) {
                continue;
            }

            stack.push(time);
        }

        return stack.size();
    }
}