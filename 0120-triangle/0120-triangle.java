class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // create dp table
        int[][] memo = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        for (int[] row: memo)
            Arrays.fill(row, Integer.MAX_VALUE);
        
        // start from the top of the triangle
        return recurse(triangle, 0, 0, memo);
    }
    
    private int recurse(List<List<Integer>> triangle, int row, int col, int[][] memo) {
        // base case
        if (row == triangle.size())
            return 0;
        
        // check dp table
        if (memo[row][col] != Integer.MAX_VALUE)
            return memo[row][col];
        
        // either go to [row + 1, col] or [row + 1, col + 1]
        int remain = Math.min(recurse(triangle, row + 1, col, memo),
                              recurse(triangle, row + 1, col + 1, memo));
        
        // combine answer with current value
        memo[row][col] = triangle.get(row).get(col) + remain;
        return memo[row][col];
    }
}