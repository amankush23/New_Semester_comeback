// Last updated: 8/4/2025, 11:13:19 PM
class Solution {
    public int MySqrt(int x) {
        return mySqrt(x);
    }
    public static int mySqrt(int n) {
        // return (int)(Math.pow(x,0.5)) ;       
        int lo = 1;
            int hi = n;
            int ans = 0;
            while (lo <= hi) {
                int mid = hi + (lo-hi)/2;
                if(Math.pow(mid,2) <= n) {
                    ans = mid;
                    lo = mid+1;
                } else {
                    hi = mid-1;
                }
            }
            return ans;
    }
}