// Last updated: 9/20/2025, 10:02:36 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        return generates(numRows);
    }
    public static List<List<Integer>> generates(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for (int row = 0; row < numRows; row++) {
            List<Integer> arr = new ArrayList<>();
            int ncr = 1;  // first value in each row
            for (int i = 0; i <= row; i++) {
                arr.add(ncr);
                ncr = ncr * (row - i) / (i + 1);  // update nCr
            }
            res.add(arr);
        }
        
        return res;
    }
}