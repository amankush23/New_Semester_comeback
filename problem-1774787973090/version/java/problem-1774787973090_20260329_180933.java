// Last updated: 29/03/2026, 18:09:33
1import java.util.*;
2
3class Solution {
4
5    static class Pair {
6        int diff;
7        int x;
8        int y;
9
10        Pair(int diff, int x, int y) {
11            this.diff = diff;
12            this.x = x;
13            this.y = y;
14        }
15    }
16
17    int[][] dirs = {
18        {-1, 0},
19        {0, -1}, {0, 1},
20        {1, 0}
21    };
22
23    public int minimumEffortPath(int[][] heights) {
24        int m = heights.length;
25        int n = heights[0].length;
26
27        int[][] result = new int[m][n];
28        for (int[] row : result) {
29            Arrays.fill(row, Integer.MAX_VALUE);
30        }
31
32        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.diff - b.diff);
33
34        pq.offer(new Pair(0, 0, 0));
35        result[0][0] = 0;
36
37        while (!pq.isEmpty()) {
38            Pair curr = pq.poll();
39            int diff = curr.diff;
40            int x = curr.x;
41            int y = curr.y;
42
43            // If destination reached
44            if (x == m - 1 && y == n - 1) {
45                return diff;
46            }
47
48            for (int[] dir : dirs) {
49                int nx = x + dir[0];
50                int ny = y + dir[1];
51
52                if (isSafe(nx, ny, m, n)) {
53                    int newDiff = Math.max(diff,
54                            Math.abs(heights[x][y] - heights[nx][ny]));
55
56                    if (result[nx][ny] > newDiff) {
57                        result[nx][ny] = newDiff;
58                        pq.offer(new Pair(newDiff, nx, ny));
59                    }
60                }
61            }
62        }
63
64        return result[m - 1][n - 1];
65    }
66
67    private boolean isSafe(int x, int y, int m, int n) {
68        return x >= 0 && x < m && y >= 0 && y < n;
69    }
70}