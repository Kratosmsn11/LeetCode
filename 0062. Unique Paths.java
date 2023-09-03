class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for(int[] t: dp){
            Arrays.fill(t, 1);
        }

        for(int col = 1; col < m; col++){
            for(int row = 1; row < n; row++){
                dp[col][row] = dp[col - 1][row] + dp[col][row - 1];
            }
        }

        return dp[m-1][n-1];
    }
}
