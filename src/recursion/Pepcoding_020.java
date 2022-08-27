package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pepcoding_020 {

    public static void main(String[] args) {
        String str, ans = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        str = sc.next();
        printSubSeq(str, ans);
    }

    public static void printSubSeq(String str, String ans) {
        if(str.length() == 0) {
            System.out.print(ans+ " ");
            return;
        };
        char ch = str.charAt(0);
        String substr = str.substring(1);
        printSubSeq(substr, ans+"");
        printSubSeq(substr, ans+ch);
    }

}
