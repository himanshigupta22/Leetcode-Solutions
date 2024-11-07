class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        printNQueens(res, board, 0);

        return res;
    }

    public void printNQueens(List<List<String>> res, char[][] board, int row){
        if(row == board.length){
            res.add(construct(board));
            return;
        }
        for(int col = 0; col < board.length; col++){
            if(isSafe(board, row, col) == true){
                board[row][col] = 'Q';
                printNQueens(res, board, row+1);
                board[row][col] = '.';
            }
        }
    }

    public List<String> construct(char[][] board){
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
 
    public boolean isSafe(char[][] board, int row, int col){
        for(int i = row - 1, j = col; i >= 0; i--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

}
