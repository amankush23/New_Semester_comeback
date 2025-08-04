// Last updated: 8/4/2025, 11:13:25 PM
class Solution {
    public int[][] generateMatrix(int n) {
        return  GenarateMatrix(n) ;
    }
        public static int[][] GenarateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int minc = 0;
        int maxc = matrix[0].length-1;
        int minr = 0;
        int maxr = matrix.length-1;
        int te = matrix.length * matrix[0].length;
       
        int num = 1;
        while (num <= te) {
            for (int i = minc; i <= maxc ; i++) {
                matrix[minr][i] = num;
                num++;
            }
            minr++;
            for (int i = minr; i <= maxr ; i++) {
                matrix[i][maxc] = num;
                num++;
            }
            maxc--;
            for (int i = maxc; i >= minc ; i--) {
                matrix[maxr][i] = num;
                num++;
            }
            maxr--;
            for (int i = maxr; i >= minr ; i--) {
                matrix[i][minc] = num;
                num++;
            }
            minc++;
        }
        return matrix;
    }
}