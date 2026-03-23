// Last updated: 23/03/2026, 23:26:47
1class Solution {
2    List<List<Integer>> allpath = new ArrayList<>();
3    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
4        List<Integer> path = new ArrayList<>();
5        path.add(0);
6        dfs(graph, 0, graph.length -1, path);
7        return allpath;
8    }
9    public void dfs(int[][] graph, int source, int des, List<Integer> path){
10        if(source == des)  allpath.add(new ArrayList<>(path));
11        for(int node : graph[source]){
12            path.add(node);
13            dfs(graph, node, des, path);
14            path.remove(path.size()-1);
15        }
16    }
17}