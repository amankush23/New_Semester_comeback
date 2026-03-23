// Last updated: 23/03/2026, 22:24:54
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph = new ArrayList<>();
4        int[] indegree = new int [numCourses];
5        for(int i = 0; i < numCourses; i++){
6            graph.add(new ArrayList<>());
7        }
8        for(int[] pre : prerequisites){
9            graph.get(pre[1]).add(pre[0]);
10            indegree[pre[0]]++;
11        }
12        Queue<Integer> q = new LinkedList<>();
13        for (int i = 0; i < numCourses; i++) {
14            if(indegree[i] == 0){
15                q.offer(i);
16            }
17        }
18        int count = 0;
19        while(!q.isEmpty()){
20            int curr = q.poll();
21            count++;
22            for(int nbrs : graph.get(curr)){
23                indegree[nbrs]--;
24                if(indegree[nbrs] == 0) q.offer(nbrs);
25            }
26        }
27        return count == numCourses;
28    }
29}