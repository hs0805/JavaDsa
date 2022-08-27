/**
 * Sudoku Solver
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sudoku[][] = new int[9][9];
        System.out.println("Enter the sudoku :");
        for(int i=0; i<9; ++i) {
            for(int j=0; j<9; ++j) {
                sudoku[i][j] = sc.nextInt();
            }
        }
        solveSudoku(sudoku, 0, 0);
    }

    static void solveSudoku(int[][] board, int i, int j) {
        if(i == board.length) {
            displayBoard(board);
            return;
        }
        int ni = 0;  // next i
        int nj = 0;  // next j
        if(j == board[0].length - 1 ) {
            // if it is last column then make column 0 and increment row
            ni = i+1;
            nj = 0;
        } else {
            //keep the row same and increment column
            ni = i;
            nj = nj+1;
        }
        if(board[i][j] != 0) {
            solveSudoku(board, ni, nj);
        } else {
            for(int val=1; val<=9; ++val) {
                if(isValid(board, i, j, val) == true) {
                    board[i][j] = val;
                    solveSudoku(board, ni, nj);
                    board[i][j] = 0;
                }
            }
        }
    }

    static boolean isValid(int[][] board, int row, int col, int val) {
        for(int i=0; i<board.length; ++i) {   // check if value exist in column or not
            if(board[i][col] == val)
                return false;
        }
        for(int j=0; j<board[0].length; ++j) {  // check if value exist in row or not
            if(board[row][j] == val)
                return false;
        }
        int smi = row/3*3;    // sub matrix initial row
        int smj = col/3*3;    // sub matrix initial col
        for(int i=0; i<3 ; ++i) {
            for(int j=0; j<3; ++j) {
                if(board[ i+smi ][ j+smj ] == val)
                    return false;
            }
        }
        return true;
    }


    static void displayBoard(int[][] board) {
        for(int i=0; i<board.length; ++i) {
            for(int j=0; j<board.length; ++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}
/**

 /**
 * INPUT:
 8 3 0 0 7 0 0 0 0
 6 0 0 1 9 5 0 0 0
 0 9 8 0 0 0 0 6 0
 8 0 0 0 6 0 0 0 3
 4 0 0 8 0 3 0 0 1
 7 0 0 0 2 0 0 0 6
 0 6 0 0 0 0 2 8 0
 0 0 0 4 1 9 0 0 5
 0 0 0 0 8 0 0 7 9

 */
