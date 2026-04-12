// Last updated: 12/04/2026, 15:22:33
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        return solve(rowIndex);
4    }
5    public List<Integer> solve(int idx){
6
7        List<List<Integer>> res = new ArrayList<>();
8        for(int row = 0;  row <= idx; row++){
9            List<Integer> ans = new ArrayList<>();
10            long ncr = 1;
11            for(int i = 0; i <= row; i++){
12                ans.add((int)ncr);
13                ncr = ncr * (row - i)/ (i+1);
14            }
15            res.add(ans);
16        }
17        return res.get(idx);
18        
19    }
20}