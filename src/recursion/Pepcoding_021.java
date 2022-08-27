/**
 * print keypad combinations
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_021 {
    static String keypad[]  = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Keypad combination :");
        String str = sc.next();
        String ans = "";
        printKPC(str, ans);
    }
//    [ 1  2  3 ]
//      a  d  g
//      b  e  h
//      c  f  i
//        2 3
//        a d
//        b e

    public static void printKPC(String str, String ans) {
        if(str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        int ch = str.charAt(0) - '0';
        String smallerStr = str.substring(1);
        String codes = keypad[ch];
        for(char character: codes.toCharArray()) {
            printKPC(smallerStr, ans+character);
        }
    }
}
