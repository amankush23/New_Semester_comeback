// Last updated: 9/20/2025, 10:02:20 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        return generate(rowIndex);
    }
    public static List<Integer> generate(int numRows) {
        
            List<Integer> arr = new ArrayList<>();
            long ncr = 1;  // first value in each row
            for (int i = 0; i <= numRows; i++) {
                arr.add((int)ncr);
                ncr = ncr * (numRows - i) / (i + 1);  // update nCr
            }
        
        return arr;
    }
}