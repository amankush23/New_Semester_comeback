// Last updated: 9/2/2025, 12:00:30 AM
class Solution {
    public int commonFactors(int a, int b) {
        int max=0;
        int count=0;
        max=Math.min(a,b);
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0)
            count++;

        }
        return count;
    }
}