// Last updated: 8/22/2025, 3:59:34 PM
class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0 ;
        for(int i =1 ; i <= n; i++){
            if(i % 3 == 0 || i % 5 ==0 || i % 7 == 0){
                sum+=i;
            }
        }
        return sum;
    }
}