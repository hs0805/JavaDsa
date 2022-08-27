/**
 * print encodings of string
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_025 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        str = sc.next();
        String ans = "";
        printEncodings(str, ans);

    }
    //123
    // if que length == 0 then print ans
    // if que length == 1 then it can be 0 or non zero
    // if que length >=2 then first option is to take out first one character and second option is to take out first two characters
    public static void printEncodings(String que, String ans) {
        if(que.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        else if(que.length() == 1) {
            char ch = que.charAt(0);
            if(ch == '0') return;
            else {
                int charVal = ch - '0';
                char code = (char)('a' + charVal -1);
                System.out.print(ans + code + " ");
            }
        } else {
            char ch = que.charAt(0);
            String roq = que.substring(1);
            if(ch == '0') {
                return;
            } else {
                int charVal = ch - '0';
                char code = (char)('a' + charVal -1);
                printEncodings(roq, ans + code);
            }

            String ch12 = que.substring(0, 2);
            String roq12  = que.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if(ch12v <=26) {
                char code = (char)('a' + ch12v -1);
                printEncodings(roq, ans + code);
            }
        }
    }
}
