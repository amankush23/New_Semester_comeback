// Last updated: 9/26/2025, 9:42:49 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        int  n = points.length;
        if(n == 1){
            return 1;
        }
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int arr1[], int arr2[]){
                if(arr1[1] == arr2[1]) return 0;
                if(arr1[1] < arr2[1]) return -1;
                return 1;
            }
        });
        int arrows =1;
        int CurrEnd = points[0][1];
        for(int i = 1; i < n; i++){
            int start = points[i][0];
            int end = points[i][1];
            if(start  > CurrEnd){
                CurrEnd = end;
                arrows++;
            }
        }
        return arrows;

    }
}