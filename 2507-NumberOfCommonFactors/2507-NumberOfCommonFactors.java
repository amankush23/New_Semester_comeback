// Last updated: 21/01/2026, 11:57:02
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