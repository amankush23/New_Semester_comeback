// Last updated: 8/4/2025, 11:09:56 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
            if(num == 0){
                return true;
            }
            int digit = num % 10;
            if(digit != 0 ){
                return true;
            }
            return false;
    }
}