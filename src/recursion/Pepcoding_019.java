/**
 * find maze paths with jumps allowed
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_019 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter source row and column and destination row and columm :");
        int sr = scn.nextInt();
        int sc = scn.nextInt();
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        ArrayList<String> res = getAllPaths(sr, sc, dr, dc);
        System.out.println("paths are :");
        for(String path: res){
            System.out.print(path + " ");
        }
    }

    public static ArrayList<String> getAllPaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String > hpaths = new ArrayList<>();
        ArrayList<String > vpaths = new ArrayList<>();
        ArrayList<String > dpaths = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        if(sc < dc) {     // for
            hpaths = getAllPaths(sr, sc+1, dr, dc);
        }
        if(sr < dr) {     // For vertical paths
            vpaths = getAllPaths(sr+1, sc, dr, dc);
        }
        if(sr < dr && sc < dc) {    // For diagonal paths
            dpaths = getAllPaths(sr+1, sc+1, dr, dc);
        }
        for(String path: hpaths) {
            res.add("H"+path);
        }
        for(String path: vpaths) {
            res.add("V"+path);
        }
        for(String path: dpaths) {
            res.add("D"+path);
        }
        return res;
    }


}
