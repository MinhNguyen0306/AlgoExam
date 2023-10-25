class Solution {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0) {
            return;
        }
        
        backtrack(board);
    }
    
    private boolean isValidChar(char[][] board, int row, int col, char c) {
        int rowBox = 3 * (row / 3);
        int colBox = 3 * (col / 3);
        for(int i = 0; i < 9; i++) {
            if(board[i][col] == c) return false;
            if(board[row][i] == c) return false;
            if(board[rowBox + i / 3][colBox + i % 3] == c) return false;
        }
        return true;
    }
    
    private boolean backtrack(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.') {
                    for(char c = '1'; c <= '9'; c++) {
                        if(isValidChar(board, i, j, c)) {
                            board[i][j] = c;
                            
                            if(backtrack(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                        
                    }
                    return false;
                }
            }
        }
        return true;
    }
}