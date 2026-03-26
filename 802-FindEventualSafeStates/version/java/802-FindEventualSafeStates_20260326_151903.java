// Last updated: 26/03/2026, 15:19:03
1import java.util.*;
2
3class Solution {
4    public List<Integer> eventualSafeNodes(int[][] graph) {
5        int n = graph.length;
6
7        // reverse graph
8        List<List<Integer>> reverse = new ArrayList<>();
9        for(int i = 0; i < n; i++) {
10            reverse.add(new ArrayList<>());
11        }
12
13        // outdegree array
14        int[] outdegree = new int[n];
15
16        for(int i = 0; i < n; i++) {
17            outdegree[i] = graph[i].length;
18            for(int v : graph[i]) {
19                reverse.get(v).add(i);
20            }
21        }
22
23        // queue for terminal nodes
24        Queue<Integer> q = new LinkedList<>();
25
26        for(int i = 0; i < n; i++) {
27            if(outdegree[i] == 0) {
28                q.add(i);
29            }
30        }
31
32        boolean[] safe = new boolean[n];
33
34        // BFS
35        while(!q.isEmpty()) {
36            int node = q.poll();
37            safe[node] = true;
38
39            for(int parent : reverse.get(node)) {
40                outdegree[parent]--;
41
42                if(outdegree[parent] == 0) {
43                    q.add(parent);
44                }
45            }
46        }
47
48        // result
49        List<Integer> result = new ArrayList<>();
50        for(int i = 0; i < n; i++) {
51            if(safe[i]) {
52                result.add(i);
53            }
54        }
55
56        return result;
57    }
58}