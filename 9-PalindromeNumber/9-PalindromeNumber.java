// Last updated: 8/4/2025, 11:14:09 PM
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int original = x;
        while(x>0){
            int last_digit = x%10;
            rev = (rev*10)+last_digit;
            x/=10;
        }
            if(rev == original){
                System.out.print("True");
                return true;
            }
            else{
                System.out.print("False");
                return false;
            }
    }
}