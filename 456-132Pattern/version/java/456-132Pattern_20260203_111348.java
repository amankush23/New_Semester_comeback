// Last updated: 03/02/2026, 11:13:48
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        int n = nums.length;
4        // if(n < 3) return false;
5        // int[] min = new int[n];
6        // min[0] = nums[0];
7        // for(int i =1; i  < n; i++){
8        //     min[i] = Math.min(nums[i-1], nums[i]);
9        // }
10
11        // for(int i = 1; i  < n-1; i++){
12        //     for(int j = i+1; j <n; j++){
13        //         if(min[i-1] < nums[j] && nums[j] < nums[i]){
14        //             return true;
15        //         }
16        //     }
17        // }
18        // return false;
19
20        Stack<Integer> stack = new Stack<>();
21        int third = Integer.MIN_VALUE;
22        for(int i = n-1; i >= 0; i--){
23            if(nums[i] < third) return true;
24            while(!stack.isEmpty() && stack.peek() < nums[i]){
25                third = stack.pop();
26            }
27            stack.push(nums[i]);
28        }
29        return false;
30    }
31}