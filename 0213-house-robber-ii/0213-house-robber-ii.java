class Solution {
     public int rob(int[] nums) {
        int n = nums.length;

        // Base cases
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        // Case 1: Exclude the first house (rob from 1 to n-1)
        int money1 = robLinear(nums, 1, n - 1);

        // Case 2: Exclude the last house (rob from 0 to n-2)
        int money2 = robLinear(nums, 0, n - 2);

        return Math.max(money1, money2);
    }

    // Helper function for House Robber I logic (linear houses)
    private int robLinear(int[] nums, int start, int end) {
        int prev = 0;
        int curr = 0;

        for (int i = start; i <= end; i++) {
            int temp = curr;
            curr = Math.max(curr, prev + nums[i]);
            prev = temp;
        }

        return curr;
    }
}