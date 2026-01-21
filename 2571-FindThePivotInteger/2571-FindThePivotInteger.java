// Last updated: 21/01/2026, 11:56:56
class Solution {
    public int pivotInteger(int n) {
        int ans=(n*(n+1))/2;
        int sq=(int)Math.sqrt(ans);
        return Math.pow(sq,2)==ans ? sq : -1;
    }
}