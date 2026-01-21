// Last updated: 21/01/2026, 11:58:41
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0 ;
        int product = 1;
        while(n > 0){
            int lastdigit = n % 10;
            sum+=lastdigit;
            product *= lastdigit;
            n= n/10;
        }
        return product - sum;
    }
}