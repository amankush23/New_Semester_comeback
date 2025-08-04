// Last updated: 8/4/2025, 11:11:16 PM
class Solution {
    public boolean judgeSquareSum(int c) {
        return judge(c);
    }
    public static boolean judge(int c) {
        long i = 0;
        long j = (long)Math.sqrt(c);
        while (i <= j) {
            if(i*i + j*j == c) {
                return true;
            } else if(i*i + j*j < c) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(i+" "+j);
        return false;
    }
}