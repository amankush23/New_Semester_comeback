// Last updated: 21/07/2026, 09:46:59
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        return Search(matrix, target);
4    }
5        public static boolean Search(int[][] arr, int item){
6        int row = 0;
7        int col = arr[0].length-1;
8        while(row < arr.length && col >=0){
9            if(arr[row][col]==item){
10                return true;
11            }
12            else if(arr[row][col]>item){
13                col--;
14            }
15            else{
16                row++;
17            }
18        }
19        return false;
20    }
21}