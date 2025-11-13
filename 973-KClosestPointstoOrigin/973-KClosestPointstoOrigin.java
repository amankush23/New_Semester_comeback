// Last updated: 11/13/2025, 11:40:40 PM
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2)->{
            return Integer.compare(e2[0], e1[0]);
        });
        for(int i = 0; i < points.length; i++){
            int[] point =points[i];
            int x = point[0],y= point[1];
            int dis = (x*x)+(y*y);
            pq.add(new int[] {dis, i});
            if(pq.size() > k){
                pq.poll();
            }
        }
            int[][] res = new int[k][2];
            int i = 0;
            while( i < k){
                int[] ele = pq.poll();
                int idx = ele[1];
                res[i][0] = points[idx][0];
                res[i][1] = points[idx][1];
                i++;
            }
            return res;
    }
    
}