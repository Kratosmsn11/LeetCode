class Solution {

    private char[][] board;
    private int ROWS;
    private int COLS;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.ROWS = board.length;
        this.COLS = board[0].length;

        for(int row = 0; row < this.ROWS; ++row){
            for(int col = 0; col < this.COLS; ++col){
                if(this.backtrack(row, col, word, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    protected boolean backtrack(int row, int col, String word, int index){
       // step 1: checking the bottom case
       if(index >= word.length()){
           return true;
        }

        // step 2: check the boundaries
        if(row < 0 || row == this.ROWS || col < 0 || col == this.COLS || this.board[row][col] != word.charAt(index)){
            return false;
        }

        // step 3 exploring the neighbors in DFS
            this.board[row][col] = '#';

            int[] rowOffsets = {0, 1, 0, -1};
            int[] colOffsets = {1, 0, -1, 0};
            for(int i = 0; i < 4; ++i){
                if(this.backtrack(row + rowOffsets[i], col + colOffsets[i], word, index + 1))
                return true;
            }

            // step 4: returning the result
            this.board[row][col] = word.charAt(index);
            return false;
    }
}
