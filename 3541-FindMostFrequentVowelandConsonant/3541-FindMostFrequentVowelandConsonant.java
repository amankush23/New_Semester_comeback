// Last updated: 8/20/2025, 10:57:37 PM
class Solution {
    public int countDigits(int num) {
        int count= 0;
        int orig = num;
        while(num !=0){
            int ld = num % 10;
            if(ld != 0 && orig % ld == 0){
                count++;
            }
            num = num/10;
        }
        return count;

    }
}