// Last updated: 9/1/2025, 11:51:53 PM
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