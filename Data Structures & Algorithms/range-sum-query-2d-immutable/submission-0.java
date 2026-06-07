class NumMatrix {
    // DP Table storing prefix sums with padded 0-th row and 0-th column
    private int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        prefixSum = new int[rows + 1][cols + 1];
        
        // Build the prefix sum matrix
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                prefixSum[r][c] = matrix[r - 1][c - 1] 
                                + prefixSum[r - 1][c] 
                                + prefixSum[r][c - 1] 
                                - prefixSum[r - 1][c - 1]; // Add back overlapping double-counted corner
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // Direct O(1) mathematical calculation using Inclusion-Exclusion
        return prefixSum[row2 + 1][col2 + 1] 
             - prefixSum[row1][col2 + 1] 
             - prefixSum[row2 + 1][col1] 
             + prefixSum[row1][col1]; // Restore the corner subtracted twice
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */