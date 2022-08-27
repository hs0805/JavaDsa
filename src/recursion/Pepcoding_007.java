/**
 * Tower of henoi
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_007 {
    public static void main(String[] args) {
        int n;
        char a = 'A', b = 'B', c = 'C';
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        toh(n, a, b, c);
    }

    public static void toh(int n, char a, char b, char c) {
        if(n == 0) return;
        //TOH(n-1 disks, src, dest, helper)
        toh(n-1, a, c, b);
        System.out.println(n + " - " + " [ " + a + " -> " + b + " ] ");
        toh(n-1, c, b, a);
    }
}
