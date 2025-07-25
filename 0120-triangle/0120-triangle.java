class Solution {
   public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // Start from second last row and go upwards
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                int below = triangle.get(row + 1).get(col);
                int belowRight = triangle.get(row + 1).get(col + 1);
                int minPath = Math.min(below, belowRight);
                triangle.get(row).set(col, triangle.get(row).get(col) + minPath);
            }
        }
        return triangle.get(0).get(0);
    }
}