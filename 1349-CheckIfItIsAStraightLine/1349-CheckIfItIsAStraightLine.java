// Last updated: 8/4/2025, 11:10:43 PM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true;
        }

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        int dx_initial = x2 - x1;
        int dy_initial = y2 - y1;

        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];

            int dx_current = xi - x1;
            int dy_current = yi - y1;

            if (dy_initial * dx_current != dx_initial * dy_current) {
                return false;
            }
        }
        return true;
    }
}