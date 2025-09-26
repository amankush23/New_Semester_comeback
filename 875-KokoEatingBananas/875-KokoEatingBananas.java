// Last updated: 9/26/2025, 2:33:08 PM
class Solution {

    public boolean canEat(int [] piles,int h,int mid) {
        int ch = 0; // total hours
        for(int i = 0; i < piles.length;i++) {
            int pile = piles[i];
            int hour = pile / mid;
            if(pile % mid > 0) {
                hour += 1;
            }
            ch += hour;
            if(ch > h) {
               return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int ho) {
        int l = 1;
        int h = Arrays.stream(piles).max().getAsInt();
        int eat = 0;
        while(l <= h) {
            int mid = l + (h - l)/2;
            if(canEat(piles, ho, mid)) {
                eat = mid;
                h = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return eat;
    }
}