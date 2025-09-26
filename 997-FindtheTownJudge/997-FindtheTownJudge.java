// Last updated: 9/27/2025, 12:53:23 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int [] count = new int [n+1];
        for(int i = 0 ; i < trust.length; i++){
            int x = trust[i][0];;
            int y = trust[i][1];;
            count[x]--;
            count[y]++;
        }
        for(int i = 1; i <= n ;i++){
            if(count[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}