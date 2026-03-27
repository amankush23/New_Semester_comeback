// Last updated: 27/03/2026, 14:10:38
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n = grid.length;
4        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
5
6        int[][] dir = {{-1,0}, {1,0},{0,-1},{0,1},{-1,-1}, {-1,1}, {1,-1},{1,1}};
7        Queue<int[]> q = new LinkedList<>();
8        q.offer(new int[]{0,0,1});
9        grid[0][0] = 1;
10        while(!q.isEmpty()){
11            int[] curr = q.poll();
12            int r = curr[0];
13            int c = curr[1];
14            int dist = curr[2];
15            if(r == n-1 && c == n-1) return dist;
16            for(int[] d : dir){
17                int nr = r + d[0];
18                int nc = c + d[1];
19
20                if(nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0){
21                    q.offer(new int[] { nr, nc, dist+1});
22                    grid[nr][nc] = 1;
23                }
24            }
25        }
26        return -1;
27
28    }
29}