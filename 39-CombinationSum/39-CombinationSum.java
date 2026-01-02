// Last updated: 1/2/2026, 11:03:48 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> arr = new ArrayList<>();
5        Combination(candidates, target, arr, 0, res);
6        return res;
7    }
8    public static void Combination(int[] can, int target, List<Integer> arr, int idx, List<List<Integer>> res){
9        if(target == 0 ){
10            res.add(new ArrayList<>(arr));
11            return;
12        }
13        for(int i = idx; i < can.length; i++){
14            if(can[i] <= target){
15                arr.add(can[i]);
16                Combination(can, target-can[i], arr, i , res);
17                arr.remove(arr.size()-1);
18            }
19        }
20    }
21}