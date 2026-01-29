// Last updated: 29/01/2026, 21:53:16
1class Solution {
2    public int maxResult(int[] nums, int k) {
3        LinkedList<Integer> list = new LinkedList<>(); 
4        list.add(0);
5        for(int i=1; i<nums.length; i++){
6            if(list.getFirst() < i-k) list.removeFirst();
7            nums[i] += nums[list.getFirst()];
8            while(!list.isEmpty() && nums[list.getLast()] <= nums[i]) list.removeLast();
9            list.addLast(i);
10        }
11        return nums[nums.length-1];
12    }
13}