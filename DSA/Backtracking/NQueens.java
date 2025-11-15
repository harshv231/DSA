public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] arr = new boolean[n][n];
        System.out.println(queens(arr, 0));
    }

    static int queens(boolean[][] arr, int row){

        if(row == arr.length){
            display(arr);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int col = 0; col<arr.length; col++){
            if(isSafe(arr, row, col)){ 
                arr[row][col] = true;
                count += queens(arr, row+1);
                arr[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] arr, int row, int col){
        //check Vertical row

        for(int i = 0; i<row; i++){
            if(arr[i][col]){
                return false; 
            }
        }

        //check left diagonal
        int min = Math.min(row, col);
        for(int i = 1; i<=min; i++){
            if(arr[row-i][col-i]){
                return false; 
            }
        }

        int minRight = Math.min(row, arr.length-col-1);
        for(int i = 1; i<=minRight; i++){
            if(arr[row - i][col+i]){
                return false;
            }
        }

        return true;
    }


    static void display(boolean[][] arr){
        for(boolean[] row: arr){
            for(boolean col: row){
                if(col){
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
