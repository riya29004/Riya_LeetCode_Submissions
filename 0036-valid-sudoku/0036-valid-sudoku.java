class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch == '.') continue;
                board[i][j] = '.';
                if(!valid(board , i , j , ch)) return false;
                board[i][j] = ch;
            }
        }
        return true;
    }

    public boolean valid(char[][] board , int row , int col , char ch){
        for(int i=0;i<board.length;i++){
            if(board[row][i] == ch) return false;
        }

        for(int i=0;i<board.length;i++){
            if(board[i][col] == ch) return false;
        }

        int startrow = (row/3)*3;
        int startcol = (col/3)*3;

        for(int i=startrow ; i<startrow+3;i++){
            for(int j=startcol;j<startcol+3;j++){
                if(board[i][j] == ch) return false;
            }
        }
        return true;
    }
}