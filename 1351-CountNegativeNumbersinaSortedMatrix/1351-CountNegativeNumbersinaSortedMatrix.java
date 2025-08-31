// Last updated: 8/31/2025, 2:13:08 PM
class Solution {
    public int countNegatives(int[][] grid) {
        return count(grid);
    }
    public int count(int[][] matrix ){
        int c=0;
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < 0){
                    c++;
                }
            }
        }
        return c;
    }
}