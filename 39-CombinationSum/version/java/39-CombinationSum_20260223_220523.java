// Last updated: 23/02/2026, 22:05:23
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<Integer> list = new ArrayList<>();
4        List<List<Integer>> ll = new ArrayList<>();
5        solve(candidates, target, list, ll , 0);
6        return ll;
7    }
8    public void solve(int[] candidates, int target,  List<Integer> ll , List<List<Integer>> list,int i){
9        if(target == 0){
10            list.add(new ArrayList<>(ll));
11            return;
12        }
13        for(int j = i; j < candidates.length; j++){
14            if(candidates[j] <= target){
15                ll.add(candidates[j]);
16                solve(candidates, target - candidates[j], ll, list, j);
17                ll.remove(ll.size()-1);
18            }
19        }
20    }
21}