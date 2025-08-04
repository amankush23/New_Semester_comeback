// Last updated: 8/4/2025, 11:11:09 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        if(letters[length-1] <= target || target < letters[0] ){
            return letters[0];
        }
        int l = 0, r = length-1;
        while(l+1 < r){
            int mid = l+(r-l)/2;
            if(letters[mid] <= target){
                l=mid;
            }
            else{
                r=mid;
            }

        }
            return letters[r];
    }
}