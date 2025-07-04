public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Sum of elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference
        return expectedSum - actualSum;
    }
}