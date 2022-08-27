/**
 * Flood fill algo
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns and matrix after that :");
        int m = sc.nextInt();
        int n= sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0; i<m; ++i) {
            for(int j=0; j<n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        String ans = "";
        boolean[][] visited = new boolean[m][n];
        floodFill(arr, 0, 0, ans, visited);
    }

    static void floodFill(int[][] maze, int row, int col, String ans, boolean visited[][]) {
        if(row<0 || col<0 || row == maze.length || col == maze[0].length ||
            maze[row][col] == 1 || visited[row][col] == true) {
//            System.out.println(ans + " ");
            return ;
        }
        if(row == maze.length-1 && col == maze[0].length-1 ) {
            System.out.print(ans + " ");
            return;
        }
        visited[row][col] = true;
        floodFill(maze, row-1, col, ans+"T", visited);
        floodFill(maze, row, col-1, ans+"L", visited);
        floodFill(maze, row+1, col, ans+"D", visited);
        floodFill(maze, row, col+1, ans+"R", visited);
    }
}

/**
 * INPUT:
  4
  3
  0 1 1
  0 0 1
  1 0 0
  0 1 0
 */
