class Solution {
     public int findDuplicate(int[] nums) {
        // Phase 1: Detect intersection point
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];       // Move one step
            fast = nums[nums[fast]]; // Move two steps
        } while (slow != fast);

        // Phase 2: Find entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}