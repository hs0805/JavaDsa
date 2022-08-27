/**
 * Knight tour problem
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter chessboard size :");
        int boardSize = sc.nextInt();
        int chess[][] = new int[boardSize][boardSize];
        System.out.println("Enter initial row and col of knight :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        knightTour(chess, r, c,1);
    }

    static void knightTour(int[][] chess, int row, int col, int move) {
        if(row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0){
            return;
        }
        else if(move >= chess.length * chess.length){
            chess[row][col] = move;
            printChess(chess);
            chess[row][col] = 0;
            return;
        }
        chess[row][col] = move;
        knightTour(chess, row-2, col+1, move+1);
        knightTour(chess, row-1, col+2, move+1);
        knightTour(chess, row+1, col+2, move+1);
        knightTour(chess, row+2, col+1, move+1);
        knightTour(chess, row+2, col-1, move+1);
        knightTour(chess, row+1, col-2, move+1);
        knightTour(chess, row-1, col-2, move+1);
        knightTour(chess, row-2, col-1, move+1);
        chess[row][col] = 0;
    }

    static void printChess(int[][] chess) {
        for(int i=0; i<chess.length; ++i) {
            for(int j=0; j<chess.length; ++j) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}
/**

 /**
 * INPUT:
 4

 */
