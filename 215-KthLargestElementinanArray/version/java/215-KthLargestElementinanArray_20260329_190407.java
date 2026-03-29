// Last updated: 29/03/2026, 19:04:07
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        return Kthlargerstelement(nums, k);
4    }
5    public static int Kthlargerstelement(int[] arr, int k){
6        PriorityQueue<Integer> pq = new PriorityQueue<>();
7        for(int i = 0 ; i < k; i++){
8            pq.add(arr[i]);
9        }
10        for(int i = k ; i< arr.length; i++){
11            if(arr[i]>pq.peek()){
12                pq.poll();
13                pq.add(arr[i]);
14            }
15        }
16        return pq.peek();
17    }
18}