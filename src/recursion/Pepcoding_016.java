/**
 * find staircase paths
 */
package recursion;
//2 -> 11, 2
//3 -> 111, 12, 21, 3
// You can take 1, 2, 3 jumps only

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs steps :");
        int n = sc.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println("Ways are :");
        for(String way: res) {
            System.out.print(way + " ");
        }
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String > res = new ArrayList<>();
            res.add("");
            return res;
        }
        else if(n<0) {
            ArrayList<String> res = new ArrayList<>();
            return  res;
        }
        ArrayList<String > path1 = getStairPaths(n-1);
        ArrayList<String > path2 = getStairPaths(n-2);
        ArrayList<String > path3 = getStairPaths(n-3);

        ArrayList<String> paths = new ArrayList<>();
        for(String p: path1) {
            paths.add(1 + p);
        }
        for(String p: path2) {
            paths.add(2 + p);
        }
        for(String p: path3) {
            paths.add(3 + p);
        }
        return paths;
    }
}
