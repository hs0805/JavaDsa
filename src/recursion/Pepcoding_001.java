/**
 * Print in decreasing order
 */
package recursion;

import java.util.Scanner;

public class Pepcoding_001 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printDecreasing(n);
    }

    static void printDecreasing(int n){
        if(n==0)
            return;
        System.out.println(n);
        printDecreasing(n-1);
    }
}
