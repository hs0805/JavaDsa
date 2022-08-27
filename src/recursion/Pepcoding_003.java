/**
 * Print in decreasing increaing order
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_003 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number n :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pdi(n);
    }

    public static void pdi(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}



