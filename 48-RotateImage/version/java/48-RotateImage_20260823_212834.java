// Last updated: 23/08/2026, 21:28:34
1class Solution {
2    public void rotate(int[][] matrix) {
3        for(int i = 0 ; i < matrix.length; i++){
4            for(int  j = i+1; j < matrix.length; j++){
5                int temp = matrix[i][j];
6                matrix[i][j] = matrix[j][i];
7                matrix[j][i] = temp;
8            }
9        }
10        int  m  = matrix.length;
11        for(int i = 0 ; i < matrix.length; i++){
12            for(int  j = 0; j < matrix.length/2; j++){
13                int temp = matrix[i][j];
14                matrix[i][j] = matrix[i][matrix.length-1-j];
15                matrix[i][matrix.length-1-j] = temp;
16            }
17        }
18
19    }
20}