/**
 * find keypad combinations
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_015 {
    static String keypad[]  = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Keypad combination :");
        String str = sc.next();
        ArrayList<String> combinations = getKPC(str);
        System.out.println("Combination of keypads are :");
        for(String combination: combinations) {
            System.out.print(combination + " ");
        }
    }
//    [ 1  2  3 ]
//      a  d  g
//      b  e  h
//      c  f  i

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("");
            return arrayList;
        }
        //123
        int ch = str.charAt(0) - '0';   // 1
        String substr = str.substring(1);
        ArrayList<String> sres = getKPC(substr);   // 23
        ArrayList<String> finalRes = new ArrayList<>();
        String codes = keypad[ch];   // abc
        for(int i=0; i<codes.length(); ++i) {
            for(String r: sres) {
                finalRes.add(codes.charAt(i) + r);
            }
        }
        return finalRes;
    }
}
