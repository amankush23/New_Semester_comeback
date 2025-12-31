// Last updated: 12/31/2025, 12:20:31 PM
1import java.util.*;
2
3class Solution {
4
5    private boolean topologicalSortCheck(
6            Map<Integer, List<Integer>> adj,
7            int n,
8            int[] indegree
9    ) {
10        Queue<Integer> queue = new LinkedList<>();
11        int count = 0;
12
13        // Add all nodes with indegree 0
14        for (int i = 0; i < n; i++) {
15            if (indegree[i] == 0) {
16                queue.offer(i);
17                count++;
18            }
19        }
20
21        while (!queue.isEmpty()) {
22            int u = queue.poll();
23
24            for (int v : adj.getOrDefault(u, new ArrayList<>())) {
25                indegree[v]--;
26
27                if (indegree[v] == 0) {
28                    queue.offer(v);
29                    count++;
30                }
31            }
32        }
33
34        return count == n;
35    }
36
37    public boolean canFinish(int numCourses, int[][] prerequisites) {
38
39        Map<Integer, List<Integer>> adj = new HashMap<>();
40        int[] indegree = new int[numCourses];
41
42        for (int[] p : prerequisites) {
43            int a = p[0];
44            int b = p[1];
45
46            // b -> a
47            adj.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
48            indegree[a]++;
49        }
50
51        return topologicalSortCheck(adj, numCourses, indegree);
52    }
53}
54