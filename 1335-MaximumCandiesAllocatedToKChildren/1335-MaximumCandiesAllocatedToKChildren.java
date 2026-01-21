// Last updated: 21/01/2026, 11:58:54
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int min =1; 
        int max =  Arrays.stream(candies).max().getAsInt() ;
        int ans = 0;
        while(min <= max){
            int mid  = min + (max - min)/2;
            if(isPossible(candies, k, mid)){
                ans = mid;
                min = mid+1;
            }
            else{
                max = mid-1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] candies, long k , int mid){
        long c = 0;
        for(int candy : candies){
            c+= candy /mid;
            if( c >= k){
                return true;
            }
        }
        return false;
    }
}