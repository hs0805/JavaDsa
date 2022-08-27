/**
 * N Queens problem
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter chessboard size :");
        int boardSize = sc.nextInt();
        int chess[][] = new int[boardSize][boardSize];
        String ans = "";
        printQueens(chess, ans, 0);
    }

    static void printQueens(int[][] chess, String ans, int row) {
        if(row == chess.length) {
            System.out.println(ans);//0-0, 1-0 ;
            return;
        }
        for(int col=0; col<chess.length; ++col) {
            if(isItSafe(chess, row, col)) {
                chess[row][col] = 1;
                printQueens(chess, ans + row + "-" + col + " ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    static boolean isItSafe(int[][]chess, int r, int c) {
        for(int i=r-1, j=c; i>=0; --i){
            if(chess[i][c] == 1)
                return false;
        }
        for(int i=r-1, j= c-1; i>=0 && j>=0; --j,--i ) {
            if(chess[i][j] == 1)
                return false;
        }
        for(int i=r-1, j=c+1;  i>=0 && j<chess.length ; --i, ++j) {
            if(chess[i][j] == 1)
                return false;
        }
        return true;
    }


}
/**

/**
 * INPUT:
 4

 */
