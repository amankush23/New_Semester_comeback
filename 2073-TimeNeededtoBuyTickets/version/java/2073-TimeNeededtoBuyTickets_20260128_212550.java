// Last updated: 28/01/2026, 21:25:50
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int time=0;
4        Queue<Integer>q= new LinkedList<>();
5        for(int i=0;i<tickets.length;i++){
6            q.add(i);
7        }
8
9        while(!q.isEmpty()){
10            time++;
11            int front = q.poll();
12
13            tickets[front]--;
14
15            if(tickets[front]!=0){
16                q.add(front);
17            }
18            else{
19                if(front==k){
20                    return time;
21                }
22            }
23        }
24        return time;     
25
26        // int time = 0;
27
28        // for (int i = 0; i < tickets.length; i++) {
29        //     if (i <= k) {
30        //         time += Math.min(tickets[i], tickets[k]);
31        //     } else {
32        //         time += Math.min(tickets[i], tickets[k] - 1);
33        //     }
34        // }
35
36        // return time;
37    }
38}