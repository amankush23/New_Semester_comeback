// Last updated: 21/01/2026, 12:00:23
class Solution {
    public int findCircleNum(int[][] isConnected) {
        n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(isConnected, i, visited);
            }
        }
        return count;
    }
    int n;
    public void dfs(int[][] adj, int u, boolean[] visited) {
        visited[u] = true;
        for (int v = 0; v < n; v++) {
            if (adj[u][v] == 1 && !visited[v]) {
                dfs(adj, v, visited);
            }
        }
    }
}