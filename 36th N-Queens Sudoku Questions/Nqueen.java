
public class Nqueen{

    //NQueen
    static int queens(boolean[][] board, int row){

        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;


        //placing queen and check for eveery row,column
        for (int col = 0; col < board.length; col++) {
            //place queen if it is safe
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        
        // check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //check diagonal left
        int maxleft = Math.min(row, col);
        for (int i = 1; i <= maxleft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        //check diagonal right
        int maxright = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxright; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;

    }

    static void display(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean element : row) {
                if(element){
                    System.out.print("Q ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }

    //NKnight
    static void knight(boolean[][] board, int row, int col, int knights){
        
        if(knights == 0){
            display1(board);
            System.out.println();
            return;
        }

        if(row == board.length-1 && col == board.length){
            return;
        }

        if(col == board.length){
            knight(board, row+1, 0, knights);
            return;
        }

        if(isSafe1(board, row, col)){
            board[row][col] = true;
            knight(board, row, col+1, knights - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knights);

    }

    static boolean isSafe1(boolean[][] board, int row, int col){

        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }

        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        return true;

    }

    // needed many time so created once to just call
    static boolean isValid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    static void display1(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean element : row) {
                if(element){
                    System.out.print("K ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        
// N-Queen Problem :
    // Queen can attack from all direction
    // N x N board place N Queens on board and how to place them as no one is in attack
    // Recursion, Backtracking
        
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println("No. Of Ways: "+queens(board, 0));
        System.out.println();
    
    // can remove for loop with multiple arguments.

// N-Knights Problem :
    // Knight means chess cha ghoda : attacks 2.5th cell
    // N x N board place N Knights on board and how to place them as no one is in attack

        boolean[][] board1 = new boolean[n][n];
        knight(board1, 0, 0, 8);

    }

}