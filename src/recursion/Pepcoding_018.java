/**
 * find maze paths with diagonal allowed
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_018 {
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
        ArrayList<String> res = new ArrayList<>();

        for(int i=1; i<=dc-sc; ++i) {   //dc=3, sc=1 we can take jumps [2-1 2-2] two jumps
            hpaths = getAllPaths(sr, sc+1, dr, dc);
            for(String hpath: hpaths) {
                res.add("H"+i+hpath);
            }
        }
        for(int i=1; i<=dr-sr; ++i) {
            vpaths = getAllPaths(sr+1, sc, dr, dc);
            for(String vpath: vpaths) {
                res.add("V"+i+vpath);
            }
        }
        return res;
    }


}
