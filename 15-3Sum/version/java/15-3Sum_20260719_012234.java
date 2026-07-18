// Last updated: 19/07/2026, 01:22:34
1class Solution {
2    static List<List<Integer>> result;
3    public List<List<Integer>> threeSum(int[] nums) {
4
5        int n = nums.length;
6        if(n < 3) return new ArrayList<>();
7        result = new ArrayList<>();
8        Arrays.sort(nums);
9        for(int i =0 ; i < n; i++){
10            if(i> 0 && nums[i] == nums[i-1]){
11                continue;
12            }
13            int n1 = nums[i];
14            int target = -n1;
15            TwoSum(nums, target,i+1,n-1,n1);
16        }
17        return result;
18    }
19    public static void TwoSum(int[] nums, int target, int i, int j, int n1){
20        while(i < j){
21            if(nums[i]+ nums[j] > target){
22                j--;
23            }
24            else if(nums[i]+ nums[j] < target){
25                i++;
26            }
27            else{
28                result.add(Arrays.asList(n1, nums[i], nums[j]));
29
30
31                while(i < j && nums[i] == nums[i+1]){
32                    i++;
33                }
34                while(i < j && nums[j] == nums[j-1]){
35                    j--;
36                }
37                
38                i++;
39                j--;
40                
41            }
42        }
43        
44        
45    }
46}