// Last updated: 8/4/2025, 11:11:44 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        return perfSqr(num);
    }
    public static boolean perfSqr(int n){
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
        if(ans*ans == n)
        return true;
        else
        return false;
}
    }
