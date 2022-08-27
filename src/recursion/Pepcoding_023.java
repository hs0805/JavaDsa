/**
 * print maze paths with jump
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_023 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter source row and column and destination row and columm :");
        int sr = scn.nextInt();
        int sc = scn.nextInt();
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        String ans = "";
        printPaths(sr, sc, dr, dc, ans);
    }

    public static void printPaths(int sr, int sc, int dr, int dc, String ans) {
        if(sc == dc && sr == dr) {
            System.out.print(ans + " ");
            return;
        }
        for(int col = 1; col<=dc-sc; ++col) {
            printPaths(sr, sc+col, dr, dc, ans+col+"H");
        }
        for(int row = 1; row<=dr-sr; ++row) {
            printPaths(sr+row, sc, dr, dc, ans+row+"V");
        }
    }


}
