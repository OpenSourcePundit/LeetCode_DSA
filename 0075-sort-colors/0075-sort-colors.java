class Solution {
   public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap 0 to the front
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Keep 1s in the middle
                mid++;
            } else {
                // Move 2s to the end
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}