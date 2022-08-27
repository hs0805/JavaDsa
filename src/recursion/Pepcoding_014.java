/**
 * find subsequences of string
 */
package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_014 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        str = sc.next();
        ArrayList<String> arrayList = new ArrayList();
        arrayList = getSubsequences(str);
        System.out.println("Subsequences are :");
        for(String s: arrayList) {
            System.out.print(s + " ");
        }
    }

    public static ArrayList<String> getSubsequences(String str) {
        if(str.length() == 0) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");            // subsequence of empty string will be empty string itself
            return res;
        }
        // We will add the first character to the result so remove it here
        char ch = str.charAt(0);   // a
        String substr = str.substring(1);  //bc

        ArrayList<String> res = getSubsequences(substr);   // res of bc = [ __, _c, b_, bc ]
        ArrayList<String> finalRes = new ArrayList<>();

        for(String r: res) {
            finalRes.add("" + r);
        }
        for(String r: res) {
            finalRes.add(ch + r);
        }
        return finalRes;
    }
}

/**
 * subsequences ( abc )
 * faith = we will get subsequence of bc = [__, _c, b_, bc]
 * expectation = we want the subsequence of abc
 * Meet faith to expectation - add the first character of initial string to result of bc
 *
 */
