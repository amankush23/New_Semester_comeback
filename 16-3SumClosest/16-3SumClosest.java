// Last updated: 9/27/2025, 2:04:09 AM
class Solution {
    public int threeSumClosest(int[] num, int target) {
        int n = num.length;
        int sum = num[0] + num[1] + num[2];
        Arrays.sort(num);
        for(int i = 0; i <= n-3;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int allsum = num[i]+num[j]+num[k];
                if(Math.abs(target-allsum)<Math.abs(target-sum)){

                    sum = allsum;
                }
                if(allsum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return sum;
    }
}