// Last updated: 23/03/2026, 22:31:28
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph = new ArrayList<>();
4        int[] indegree = new int[numCourses];
5
6        for(int i = 0; i < numCourses; i++){
7            graph.add(new ArrayList<>());
8        }
9
10        for(int[] pre : prerequisites){
11            graph.get(pre[1]).add(pre[0]);
12            indegree[pre[0]]++;
13        }
14
15        Queue<Integer> q = new LinkedList<>();
16        for(int i = 0; i < numCourses; i++){
17            if(indegree[i] == 0){
18                q.offer(i);
19            }
20        }
21        int[] order = new int[numCourses];
22        int idx = 0;
23
24        while(!q.isEmpty()){
25            int curr = q.poll();
26            order[idx++] = curr;
27
28            for(int nbr : graph.get(curr)){
29                indegree[nbr]--;
30                if(indegree[nbr] == 0){
31                    q.offer(nbr);
32                }
33            }
34        }
35
36        if(idx == numCourses) return order;
37        return new int[0];
38    }
39}