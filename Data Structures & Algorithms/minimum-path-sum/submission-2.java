class Solution {
    public int minPathSum(int[][] grid) {
        int r = grid.length, c=grid[0].length;
        int[] dp = new int[c+1];
        for(int i=0; i<=c; i++) dp[i] = Integer.MAX_VALUE;

        dp[c-1] = 0;
        for(int i=r-1; i>=0; i--){
            for(int j=c-1; j>=0; j--) {
                dp[j] = grid[i][j] + Math.min(dp[j], dp[j+1]);
            }
        }
        return dp[0];
    }
}