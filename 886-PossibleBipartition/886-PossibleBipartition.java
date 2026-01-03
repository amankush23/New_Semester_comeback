// Last updated: 1/3/2026, 11:15:12 PM
1class Solution {
2    public boolean possibleBipartition(int n, int[][] dislikes) {
3        HashMap<Integer,List<Integer>>map = new HashMap<>();
4        for(int i=1;i<=n;i++){
5            map.put(i,new ArrayList<>());
6        }
7        for(int e[] : dislikes){
8            int v1 = e[0];
9            int v2 = e[1];
10            map.get(v1).add(v2);
11            map.get(v2).add(v1);
12        }
13
14        HashMap<Integer,Integer>visited = new HashMap<>(); // vtx:dis
15
16        Queue<Pair>q = new LinkedList<>();
17        
18        for(int i=1;i<n;i++){
19            if(visited.containsKey(i)){
20                continue;
21            }
22            q.add(new Pair(i,0));
23        
24            while(!q.isEmpty()){
25                Pair rm = q.poll();
26
27                if(visited.containsKey(rm.vtx)){
28                    if(visited.get(rm.vtx)!=rm.dist){
29                        return false;
30                    }
31                    continue;
32                }
33                visited.put(rm.vtx,rm.dist);
34
35                for(int ngbr : map.get(rm.vtx)){
36                    if(!visited.containsKey(ngbr)){
37                        q.add(new Pair(ngbr, rm.dist+1));
38                    }
39                }
40            }
41        }
42        return true;
43    }
44
45    class Pair{
46        int vtx;
47        int dist;
48        public Pair(int vtx, int dist){
49            this.vtx = vtx;
50            this.dist = dist;
51        }
52    }
53}