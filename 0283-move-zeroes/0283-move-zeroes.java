class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                // Swap nums[lastNonZeroFoundAt] and nums[cur]
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = temp;

                lastNonZeroFoundAt++;
            }
        }
    }
}
