// Last updated: 10/20/2025, 2:43:59 PM
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b)-> a[0] == b[0] ? b[1]- a[1] : a[0]- b[0]);
        int[] dp  = new int[envelopes.length];
        int maxlen = 0 ;
        for(int i =  0 ; i < dp.length ; i++){
            int idx = BinarySearch(dp, 0,maxlen ,envelopes[i][1]);
            dp[idx] = envelopes[i][1];
            if(idx == maxlen){
                maxlen++;
            }
        }
        return maxlen;
    }
    public int BinarySearch(int[] arr, int si, int ei, int item){
        int idx = Arrays.binarySearch(arr, si, ei, item);
        if(idx < 0){
            idx = -(idx+1);
        }
        return idx;
    }
}