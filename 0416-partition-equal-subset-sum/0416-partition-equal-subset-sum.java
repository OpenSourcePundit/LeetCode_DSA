class Solution {
    public boolean canPartition(int[] nums) {
          int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If sum is odd, can't partition into two equal subsets
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // sum 0 is always achievable (by taking no elements)

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];
    }
}