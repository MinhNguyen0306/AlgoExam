class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        if(r * c != m * n) return mat;
        
        int[][] newMat = new int[r][c];
        
        // Optimize
        for(int i = 0; i < r * c; i++) {
            newMat[i/c][i%c] = mat[i/n][i%n];
        }
        
        // Brute Force
        // int row = 0;
        // int col = 0;
        // for(int i = 0; i < m; i++) {
        //     for(int j = 0; j < n; j++) {
        //         newMat[row][col] = mat[i][j];
        //         col++;
        //         if(col == c) {
        //             col = 0;
        //             row++;
        //         }
        //     }
        // }
        
        return newMat;
    }
}