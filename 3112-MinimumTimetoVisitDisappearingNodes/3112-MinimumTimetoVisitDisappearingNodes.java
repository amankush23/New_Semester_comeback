// Last updated: 1/2/2026, 11:58:42 PM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        HashMap<Integer, HashMap<Integer,Integer>>map = new HashMap<>();
4
5        for(int i=0;i<n;i++){
6            map.put(i,new HashMap<>());
7        }
8
9        for(int e[] : edges){
10            int e1 = e[0];
11            int e2 = e[1];
12            int cost = e[2];
13            map.get(e1).put(e2,Math.min(cost,map.get(e1).getOrDefault(e2,Integer.MAX_VALUE)));
14            map.get(e2).put(e1,Math.min(cost,map.get(e2).getOrDefault(e1,Integer.MAX_VALUE)));
15        }
16
17        HashSet<Integer>visited = new HashSet<>();
18        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
19            return a.cost-b.cost;
20        });
21        pq.add(new Pair(0,0));
22        int dist[] = new int[n];
23        Arrays.fill(dist,-1);
24        dist[0]=0;
25
26        while(!pq.isEmpty()){
27            // remove
28            Pair rm = pq.poll();
29
30            // check
31            if(visited.contains(rm.vtx)){
32                continue;
33            }
34            
35            // mark visited
36            visited.add(rm.vtx);
37
38            // self work
39            if(rm.cost>=disappear[rm.vtx]){
40                continue;  
41            }
42            dist[rm.vtx] = rm.cost;
43
44            // add ngbrs
45            for(int ngbr : map.get(rm.vtx).keySet()){
46                if(!visited.contains(ngbr)){
47                    pq.add(new Pair(ngbr, rm.cost+map.get(rm.vtx).get(ngbr)));
48                }
49            }
50        }
51        return dist;
52    }
53
54    class Pair{
55        int vtx;
56        int cost;
57        public Pair(int vtx, int cost){
58            this.vtx = vtx;
59            this.cost = cost;
60        }
61    }
62}