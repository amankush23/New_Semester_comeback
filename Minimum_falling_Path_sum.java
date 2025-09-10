class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int[] a:dp){
            Arrays.fill(a, -66666);
        }
        for(int col = 0 ; col < matrix[0].length; col++){
            ans = Math.min(ans, Minimum_fal_sum(matrix, 0, col, dp));
        }
        return ans;
    }
    public static int Minimum_fal_sum(int [][] matrix, int cr, int cc, int[][] dp){
        if(cc < 0 || cc >= matrix[0].length){
            return Integer.MAX_VALUE;
        }
        if(cr == matrix.length-1){
            return matrix[cr][cc];
        }
        if(dp[cr][cc] != -66666){
            return dp[cr][cc];
        }
        int ld = Minimum_fal_sum(matrix, cr+1, cc-1,dp);
        int rd = Minimum_fal_sum(matrix, cr+1, cc+1,dp);
        int d = Minimum_fal_sum(matrix, cr+1, cc,dp);
        return dp[cr][cc] = Math.min(rd, Math.min(ld, d))+matrix[cr][cc];
    }
}
