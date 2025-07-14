class Solution {
    public int minFallingPathSum(int[][] matrix) {
         int n = matrix.length;
        int[][] dp = new int[n][n];

        // Base case: first row same as input
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int above = dp[i - 1][j];
                int leftDiag = (j > 0) ? dp[i - 1][j - 1] : Integer.MAX_VALUE;
                int rightDiag = (j < n - 1) ? dp[i - 1][j + 1] : Integer.MAX_VALUE;
                dp[i][j] = matrix[i][j] + Math.min(above, Math.min(leftDiag, rightDiag));
            }
        }

        // Find the minimum in the last row
        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            minSum = Math.min(minSum, dp[n - 1][j]);
        }

        return minSum;
    }
}