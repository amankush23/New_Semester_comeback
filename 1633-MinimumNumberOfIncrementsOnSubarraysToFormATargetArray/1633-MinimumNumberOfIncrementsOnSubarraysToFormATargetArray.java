// Last updated: 21/01/2026, 11:58:20
class Solution {
    public int minNumberOperations(int[] target) {
        int n = target.length;
        int sum = target[0];
        for(int i = 1; i < n; i++){
            if(target[i] > target[i-1]){
                sum+= target[i]-target[i-1];
            }
        }
        return sum;
    }
}