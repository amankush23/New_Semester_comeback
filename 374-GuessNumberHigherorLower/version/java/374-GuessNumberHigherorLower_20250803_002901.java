// Last updated: 8/3/2025, 12:29:01 AM
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=0;
        int j=n;
        while(i <= j){
            // int guess(int num);
            int mid = i+(j-i)/2;
            if(guess(mid) == 0){
                return mid;
            }
            else if(guess(mid) ==1){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return -1;
    }
}