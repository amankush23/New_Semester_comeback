// Last updated: 1/2/2026, 11:30:20 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> arr = new ArrayList<>();
5        Combination(nums,arr, 0,res);
6        return res;
7    }
8    public static void Combination(int[] can, List<Integer> arr, int idx, List<List<Integer>> res){
9        if(idx == can.length ){
10            res.add(new ArrayList<>(arr));
11            return;
12        }
13                arr.add(can[idx]);
14                Combination(can, arr, idx+1 , res);
15                arr.remove(arr.size()-1);
16                Combination(can, arr, idx+1 , res);
17         
18    }
19}