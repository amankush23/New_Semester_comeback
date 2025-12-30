// Last updated: 12/30/2025, 11:31:25 PM
1class Solution {
2    int m, n;
3    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
4    public int[][] updateMatrix(int[][] matrix) {
5        m = matrix.length;
6        n = matrix[0].length;
7        
8        int[][] result = new int[m][n];
9        
10        Queue<int[]> que = new LinkedList<>();
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                if (matrix[i][j] == 0) {
14                    result[i][j] = 0;
15                    que.offer(new int[] {i, j});
16                }
17                else {
18                    result[i][j] = -1;
19                }
20            }
21        }
22
23        while (!que.isEmpty()) {
24            int[] cell = que.poll();
25            int i = cell[0];
26            int j = cell[1];
27            
28            for (int[] dir : directions) {
29                
30                int new_i = i + dir[0];
31                int new_j = j + dir[1];
32                
33                if(new_i >= 0 && new_i < m && new_j >= 0 && new_j < n && result[new_i][new_j] == -1) {
34                    result[new_i][new_j] = result[i][j] + 1;
35                    que.add(new int[] {new_i, new_j});
36                }
37            }
38        }
39        
40        return result;
41    }
42}