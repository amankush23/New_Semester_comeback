// Last updated: 12/04/2026, 15:15:59
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        return generates(numRows);
4    }
5    public static List<List<Integer>> generates(int numRows) {
6        List<List<Integer>> res = new ArrayList<>();
7        
8        for (int row = 0; row < numRows; row++) {
9            List<Integer> arr = new ArrayList<>();
10            int ncr = 1;  // first value in each row
11            for (int i = 0; i <= row; i++) {
12                arr.add(ncr);
13                ncr = ncr * (row - i) / (i + 1);  // update nCr
14            }
15            res.add(arr);
16        }
17        
18        return res;
19    }
20}