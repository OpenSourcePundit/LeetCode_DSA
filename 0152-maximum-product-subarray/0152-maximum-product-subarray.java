import java.util.Scanner;

class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // If the current element is negative, swapping maxSoFar and minSoFar
            // ensures that maxSoFar is always the maximum product up to the current element.
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Calculate max and min product up to the current element
            maxSoFar = Math.max(current, maxSoFar * current);
            minSoFar = Math.min(current, minSoFar * current);

            // Update the global maximum product
            result = Math.max(result, maxSoFar);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read the size of the array
            int n = sc.nextInt();
            int[] nums = new int[n];

            // Read the array elements
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            // Create an instance of the Solution class
            Solution solution = new Solution();
            // Find the maximum product subarray for this test case
            int result = solution.maxProduct(nums);

            // Print the result
            System.out.println(result);
        }

        sc.close();
    }
}
