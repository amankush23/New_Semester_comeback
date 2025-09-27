// Last updated: 9/27/2025, 10:03:15 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return Kthlargerstelement(nums, k);
    }
    public static int Kthlargerstelement(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < k; i++){
            pq.add(arr[i]);
        }
        for(int i = k ; i< arr.length; i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}