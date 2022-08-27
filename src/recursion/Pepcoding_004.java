/**
 * It calculate the factorial of program
 */

package recursion;

import java.util.Scanner;

public class Pepcoding_004 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Factorial is :" + factorial(n));
    }

    public static int factorial(int n) {
        if(n==0)
            return 1;
        int fact = n*factorial(n-1);
        return fact;
    }
}
