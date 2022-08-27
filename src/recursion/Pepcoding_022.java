/**
 * print maze paths
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_022 {
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
        if(sc<dc) {
            printPaths(sr, sc+1, dr, dc, ans+"H");
        }
        if(sr<dr) {
            printPaths(sr+1, sc, dr, dc, ans+"V");
        }
    }


}
