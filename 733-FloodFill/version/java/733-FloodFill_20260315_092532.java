// Last updated: 15/03/2026, 09:25:32
1class Solution {
2        
3    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
4         int m = image.length;
5         int n = image[0].length;
6        int original = image[sr][sc];
7        if(original == color) return image;
8        dfs(image, sr, sc,original, color, m, n);
9        return image;
10    }
11    public void dfs(int[][] image, int i, int j, int original, int color, int m, int n){
12        if(i < 0 || j < 0 || i >= m || j >= n ){
13            return ;
14        }
15        if(image[i][j] != original) return;
16        image[i][j] = color;
17        dfs(image, i+1, j,original, color, m, n);
18        dfs(image, i, j-1,original, color, m,n );
19        dfs(image, i-1, j,original, color, m, n);
20        dfs(image, i, j+1,original, color, m, n);
21        
22    }
23}