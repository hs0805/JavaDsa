/**
 * permutations of string
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_024 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        str = sc.next();
        String ans = "";
        printPermutations(str, ans);

    }
    //              remove a  -  remove b  -  remove c
    // abc ->           bc            ac          ab
    // Add in ans       a           b            c

    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for(int i=0; i<str.length(); ++i) {
            char ch = str.charAt(i);
            String lstr = str.substring(0, i);
            String rstr = str.substring(i+1);
            printPermutations(lstr+rstr, ans+ch);
        }
    }
}
