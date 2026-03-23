// Last updated: 23/03/2026, 23:09:51
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        boolean[] visited = new boolean[n];
5        int count = 0;
6        for(int i = 0; i< n;i++){
7            if(!visited[i]){
8                count++;
9                dfs(isConnected, i , visited);
10            }
11        }
12        return count;
13    }
14    public void dfs(int[][] arr, int u, boolean[] visited){
15        visited[u] = true;
16        for(int v = 0 ;  v < arr.length; v++){
17            if(arr[u][v] == 1 && !visited[v]) 
18                dfs(arr, v, visited);
19        }
20    }
21}