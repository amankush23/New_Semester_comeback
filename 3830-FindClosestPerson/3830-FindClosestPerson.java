// Last updated: 21/01/2026, 11:55:57
class Solution {
    public int findClosest(int x, int y, int z) {
        int distanceX = Math.abs(z-x);
        int distanceY = Math.abs(z-y);

        if(distanceX > distanceY)
        {
            return 2;
        }
        else if(distanceX == distanceY)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}