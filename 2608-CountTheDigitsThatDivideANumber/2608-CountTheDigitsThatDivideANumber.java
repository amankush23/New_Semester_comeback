// Last updated: 21/01/2026, 11:56:54
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