// Last updated: 27/02/2026, 12:20:34
1class Solution {
2    public int numEnclaves(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        for(int i =0; i < n ;i++){
6            for(int j = 0; j < m; j++){
7                if((i == 0 || j == 0 || i == n - 1 || j == m-1) && grid[i][j] == 1){
8                    dfs(grid, i , j);
9                }
10            }
11        }
12        int s = 0;
13        for(int i =0; i < n ;i++){
14            for(int j = 0; j < m; j++){
15                s+= grid[i][j];
16            }
17        }
18        return s;
19    }
20    public void dfs(int[][] grid, int i , int j){
21        int n = grid.length;
22        int m = grid[0].length;
23        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]==0){
24            return;
25        }
26        grid[i][j] = 0;
27        dfs(grid,i+1, j);
28        dfs(grid,i-1, j);
29        dfs(grid,i, j+1);
30        dfs(grid,i, j-1);
31    }
32}