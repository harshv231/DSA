public class SudokuSolver {
    public static void main(String[] args) {
        
    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        //for row 

        for(int i = 0; i<board.length; i++){
            if(board[row][col] == num){
                return false;
            }
        }

        for(int[] nums: board){
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int start = row - row%3;
        int end = col - col%3;

        for(int i = start; i<start+sqrt; i++){
            for (int j = end; j < end + sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;


    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(board[i][j] == 0){
                    row =i;
                    col =j;
                    emptyLeft = false;
                    break;
                }
            }

            if(emptyLeft == false){
                break;
            }
        }

        if(emptyLeft == true){
            return true;
        }

        for(int number = 1; number<=n; number++){
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    display(board); 
                    return true;
                }else{
                    board[row][col] = 0 ;
                }
            }
        }
        return false;
    }

    static void display(int[][] board){
        for(int[] row: board){
            for(int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
