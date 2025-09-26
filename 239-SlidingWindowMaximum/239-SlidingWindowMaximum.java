// Last updated: 9/26/2025, 11:43:47 PM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n =nums.length;
        int res[] = new int[n-k+1];
        if(n == 0){
            return res;
        }
        int index = 0;
        while(index < k){
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[index]){
                deque.pollLast();
            }
            deque.offerLast(index);
            index++;
        }
        res[0] = nums[deque.peekFirst()];
        for(int i = 0; i < n-k+1; i++){
            if(!deque.isEmpty() && deque.peekFirst()<=(i-1)){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i+k-1]){
                deque.pollLast();
            }
            deque.offerLast(i+k-1);
            res[i] = nums[deque.peekFirst()];
        }
        return res;

    }
}