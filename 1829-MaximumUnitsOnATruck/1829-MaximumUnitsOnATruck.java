// Last updated: 21/01/2026, 11:58:03
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         Arrays.sort(boxTypes, (a, b) -> b[1]-a[1]);


         
        int ans = 0;
       
        for (int i = 0; i < boxTypes.length; i++) {
            int type = boxTypes[i][0];
            int size = boxTypes[i][1];
            if (type < truckSize) { 
                ans += type * size;
                truckSize -= type;
                
            } else {
                ans += truckSize * size;
                truckSize = 0;
            }

            if (truckSize == 0) {
                break;
            }

        }
     
        return ans;




    }
}