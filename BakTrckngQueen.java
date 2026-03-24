import java.util.ArrayList;
import java.util.List;

class BakTrckngQueen {

    // Only check upper-left, vertical, and upper-right
    public boolean isSafe(int row, int col, char[][] board){
        int n = board.length;

        // check vertical (above)
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q') return false;
        }

        // check upper-left diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }

        // check upper-right diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Save board configuration
    public void saveBoard(char[][] board, List<List<String>> allBoards){
        List<String> newBoard = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            String row = "";
            for(int j = 0; j < board[0].length; j++){
                row += board[i][j];
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    // Backtracking helper
    public void helper(char[][] board, List<List<String>> allBoards, int row){
        if(row == board.length){
            saveBoard(board, allBoards);
            return;
        }

        for(int col = 0; col < board.length; col++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    // Main function
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }
}
