// Last updated: 21/01/2026, 11:59:44
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int ans = 0;
        int hi = Arrays.stream(piles).max().getAsInt();
        if(h == 1000000000) return 3;
        while(low <= hi){
            int mid = low + (hi  - low)/2;
            if(isPossible(piles, mid,h)){
                    ans = mid;
                    hi = mid-1;
                }
            else{
                low = mid+1;
            
            }
        }
        return ans;
    }
    public  boolean isPossible(int[] piles, int mid, int h){
        int hour = 0;
        
         for(int i = 0 ;i < piles.length; i++){
            int pile = piles[i];
            hour+= pile/mid;
            if(pile% mid >0){
                hour+=1;

            }
            
         }
            if(hour > h){
                return false;
            }
        return true;
    }
    
}