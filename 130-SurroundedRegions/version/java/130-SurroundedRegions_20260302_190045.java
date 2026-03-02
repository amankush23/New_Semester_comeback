// Last updated: 02/03/2026, 19:00:45
1class Solution {
2    public void solve(char[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        for(int i =0; i < m; i++){
6            if(matrix[i][0] == 'O') dfs(matrix,i , 0 );
7            if(matrix[i][n-1] == 'O') dfs(matrix,i , n-1 );
8        }
9        for(int j =0; j < n; j++){
10            if(matrix[0][j] == 'O') dfs(matrix,0 , j );
11            if(matrix[m-1][j] == 'O') dfs(matrix,m-1 , j);
12        }
13        for(int i = 0; i < m; i++){
14            for(int j = 0; j < n; j++){
15                if(matrix[i][j] == 'O') matrix[i][j] = 'X';
16                if(matrix[i][j] == '@') matrix[i][j] = 'O';
17            }
18        }
19    }
20    public void dfs(char[][] grid, int i , int j){
21        int n = grid.length;
22        int m = grid[0].length;
23        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]!='O'){
24            return;
25        }
26        grid[i][j] = '@';
27        dfs(grid,i+1, j);
28        dfs(grid,i-1, j);
29        dfs(grid,i, j+1);
30        dfs(grid,i, j-1);
31    }
32    
33}