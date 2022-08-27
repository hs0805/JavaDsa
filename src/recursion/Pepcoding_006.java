/**
 * Print zigzag
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_006 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printZigZag(n);
    }

    public static void printZigZag(int n) {
        if(n == 0)
            return;
        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
    }
}
