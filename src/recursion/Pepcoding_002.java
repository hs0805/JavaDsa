/**
 * Print in increasing order
 */

package recursion;
import java.util.Scanner;

public class Pepcoding_002 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter your input :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {
        if(n == 0)
            return;
        printIncreasing(n-1);
        System.out.println(n);
    }
}
