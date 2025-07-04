public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // index for placing the next unique number

        for (int i = 1; i < nums.length; i++) {
            // if current number is different from previous, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // place it at position k
                k++; // move to next position
            }
        }

        return k;
    }
}