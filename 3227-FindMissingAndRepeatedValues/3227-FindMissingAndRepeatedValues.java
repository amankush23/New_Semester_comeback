// Last updated: 21/01/2026, 11:56:29
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> ll = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(!set.add(grid[i][j])){
                    ll.add(grid[i][j]);
                }
            }
        }
        for(int k = 1 ; k<= grid.length * grid.length; k++){
            if(!set.contains(k)){
                ll.add(k);
                break;
            }
        }
        int[] ans = new int[2];
        ans[0] = ll.get(0);
        ans[1] = ll.get(1);

        return ans;


    }
}
